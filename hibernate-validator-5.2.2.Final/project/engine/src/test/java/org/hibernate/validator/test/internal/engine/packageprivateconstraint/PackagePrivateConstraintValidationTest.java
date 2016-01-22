/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.test.internal.engine.packageprivateconstraint;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.hibernate.validator.testutil.TestForIssue;
import org.hibernate.validator.testutil.ValidatorUtil;

import static org.testng.Assert.assertEquals;

/**
 * Tests the validation of package-private constraints.
 *
 * @author Gunnar Morling
 */
@TestForIssue(jiraKey = "HV-843")
public class PackagePrivateConstraintValidationTest {

	private Validator validator;

	@BeforeMethod
	public void setupValidator() {
		validator = ValidatorUtil.getValidator();
	}

	@Test
	public void shouldValidatePackagePrivateConstraint() {
		Set<ConstraintViolation<Giraffe>> violations = validator.validate( new Giraffe() );
		assertEquals( violations.size(), 1 );
		assertEquals(
				violations.iterator().next().getConstraintDescriptor().getAnnotation().annotationType(),
				ValidAnimalName.class
		);
	}

	/**
	 * Currently it's not possible to have an annotation which is declared as inner-type within a package-private
	 * annotation type and have that inner annotation refer to that outer annotation type.
	 * <p>
	 * That means it is not possible to work with the conventional pattern of an inner {@code @List} annotation for
	 * multi-valued constraints if the actual constraint type is package private. Thus the multi-value annotation is a
	 * top-level type itself as workaround here.
	 * <p>
	 * This is a limitation of how proxies for annotations are generated by the JDK.
	 */
	@Test
	public void shouldValidatePackagePrivateMultiValueConstraint() {
		Set<ConstraintViolation<PolarBear>> violations = validator.validate( new PolarBear() );
		assertEquals( violations.size(), 1 );
		assertEquals(
				violations.iterator().next().getConstraintDescriptor().getAnnotation().annotationType(),
				ValidAnimalName.class
		);
	}
}

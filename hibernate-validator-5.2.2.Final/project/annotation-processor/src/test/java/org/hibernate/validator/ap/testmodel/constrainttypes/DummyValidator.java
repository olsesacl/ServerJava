/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.ap.testmodel.constrainttypes;

import java.lang.annotation.Annotation;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Gunnar Morling
 */
public class DummyValidator implements ConstraintValidator<Annotation, Object> {

	public void initialize(Annotation constraintAnnotation) {
		throw new UnsupportedOperationException( "Not implemented" );
	}

	public boolean isValid(Object value, ConstraintValidatorContext context) {
		throw new UnsupportedOperationException( "Not implemented" );
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author 2daw
 */

@Entity
@Table(name="profesores")
public class Profesor implements Serializable{
    
    @Id
    @Column(name="id")
    private int id;
    
    @NotNull
    @Size(min=3, max=50)
    @Column(name="nombre")
    private String nombre;
    
    @NotNull
    @Size(min=3, max=50)
    @Column(name="ape1")
    private String ape1;

    @Size(min=3, max=50)
    @Column(name="ape2")
    private String ape2;

    public Profesor() {
    }

    public Profesor(String nombre, String ape1, String ape2) {
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
    }
    
}

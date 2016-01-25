/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.ScriptAssert;

/**
 *
 * @author 2daw
 */
@Entity
@Table(name="Usuario")
@ScriptAssert(lang="javascript",script="(_this.password!=null)?_this.password.equals(_this.confirm_password):false",message="Los dos passwords deben de ser iguales")
public class Usuario implements Serializable{
    
    @Id
    private int id_usuario;
    private String login;
    private String nombre;
    private String ape1;
    private String ape2;
    @NotNull
    private String password;
    private String confirm_password;

    public Usuario() {
    }

    public Usuario(String login, String nombre, String ape1, String ape2, String password, String confirm_password) {
        this.login = login;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.password = password;
        this.confirm_password = confirm_password;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }
    
    
    
}

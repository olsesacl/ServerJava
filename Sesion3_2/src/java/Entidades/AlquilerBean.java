/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author sergi
 */
public class AlquilerBean {
    private String pelicula;
    private int dias;
    private int edad;
    private int pago;
    private String extras;

    /**
     * @return the pelicula
     */
    public String getPelicula() {
        return pelicula;
    }

    /**
     * @param pelicula the pelicula to set
     */
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * @return the dias
     */
    public String getDias() {
        return String.valueOf(dias);
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(String dias) {
        this.dias = Integer.parseInt(dias);
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        if(this.edad == 1) return "-7";
        else if(this.edad == 2) return "-14";
        else if (this.edad == 3) return "-18";
        else return "+18";        
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = Integer.parseInt(edad);
    }

    /**
     * @return the pago
     */
    public String getPago() {
        if(this.pago == 1) return "Visa";
        else if(this.pago == 2) return "MasterCard";
        else if (this.pago == 3) return "Paypal";
        else return "contra reembolso"; 
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(String pago) {
        this.pago = Integer.parseInt(pago);;
    }

    /**
     * @return the extras
     */
    public String getExtras() {
        return extras;
    }

    /**
     * @param extras the extras to set
     */
    public void setExtras(String extras) {
        this.extras = extras;
    }
    
    
    
}

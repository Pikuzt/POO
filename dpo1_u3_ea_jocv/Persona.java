/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo1_u3_ea_jocv;

import java.util.Scanner;

/**
 *
 * @author pikuzt
 */

/* se crea  un una clase astractta para personalala cual tiene como rama cliente y personal
asi mismo se declaran las variables  como privadas y se greag los set y get con su constructor.
*/
public  abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private  String ine;
    private String calle;
    private String colonia;
    private int numero;

    public Persona(String nombre, String apellido, int edad, String telefono, String ine, String calle, String colonia, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.ine = ine;
        this.calle = calle;
        this.colonia = colonia;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIne() {
        return ine;
    }

    public void setIne(String ine) {
        this.ine = ine;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\n nombre=" + nombre + ", \napellido=" + apellido + ", \n edad=" + edad + ", \n telefono=" + telefono + ",\n ine=" + ine + ", \n calle=" + calle + ",\n colonia=" + colonia + ",\n numero=" + numero;
    }
    
    
    
    
    
    
    
    
}

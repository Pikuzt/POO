/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo1_u3_ea_jocv;

/**
 *
 * @author pikuzt
 */


 /*
    creamos la clase libro la cual llevara variables privadas cono su constructor y su 
get y set.
    */
public class Libro {
    
    private String nombreLibro;
    private String autor;
    private String editoria;
    private String edicion;
    

    public Libro(String nombreLibro, String autor, String editoria, String edicion) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.editoria = editoria;
        this.edicion = edicion;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditoria() {
        return editoria;
    }

    public void setEditoria(String editoria) {
        this.editoria = editoria;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombreLibro=" + nombreLibro + ", autor=" + autor + ", editoria=" + editoria + ", edicion=" + edicion + '}';
    }
    
    
    
    
    
}

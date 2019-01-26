/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo1_u3_a1_jocv;

/**
 *
 * @author pikuzt
 */
public class AutoDeportivo extends Coche{
    //Declaramos las variales
     private double costo;

     //se crean los metodos set y get 
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
        //Creamos el constructor  como  ocupamos herencia e ocupa la libreria super
        //para llamar  alas variables de la clase padre.
    
    public AutoDeportivo(double costo, String modeloCoche, String marcaCoche, int velocidadActualCoche, int velocidadPromedioCoche) {
        super(modeloCoche, marcaCoche, velocidadActualCoche, velocidadPromedioCoche);
        this.costo = costo;
    }   
    /*    
    creamos la funcion toString la cual mostrar los datos    
    */
     @Override
    public String toString(){
        return "Costo:"+costo+"\n Marca:" +marcaCoche+" \n Velocidad:"+velocidadActualCoche+"\n Velocidad Promedio:"+velocidadPromedioCoche;
    }   
}

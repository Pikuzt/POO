/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo1_u3_ea_jocv;



/*
como es un  herencia de un metodo astracto
no es necesario agregar variables por hereda de personal 
solo es necesario crear el constructor
con la libreria super
*/
public class Empleado extends Persona {

    public Empleado(String nombre, String apellido, int edad, String telefono, String ine, String calle, String colonia, int numero) {
        super(nombre, apellido, edad, telefono, ine, calle, colonia, numero);
    }

   

   
    
    
    
}

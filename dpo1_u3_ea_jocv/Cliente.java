package dpo1_u3_ea_jocv;

/**
 *
 * @author pikuzt
 */

/*
como es un  herencia de un metodo astracto
no es necesario agregar variables por hereda de personal 
solo es necesario crear el constructor
con la libreria super
*/
public class Cliente extends Persona{

    public Cliente(String nombre, String apellido, int edad, String telefono, String ine, String calle, String colonia, int numero) {
        super(nombre, apellido, edad, telefono, ine, calle, colonia, numero);
    }

}

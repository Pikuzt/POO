
package dpo1_u3_a1_jocv;

/**
 *
 * @author pikuzt
 */
public class Coche {
    /*creaos las variables
    como privadas.
    */
      String modeloCoche;
      String marcaCoche;
      int velocidadActualCoche;
      int velocidadPromedioCoche;
    
     
      /*
      creamos el constructor coche.
      */
     public Coche(String modeloCoche, String marcaCoche, int velocidadActualCoche, int velocidadPromedioCoche)
    {
        this.marcaCoche = marcaCoche;
        this.modeloCoche = modeloCoche;
        this.velocidadActualCoche = velocidadActualCoche;
        this.velocidadPromedioCoche = velocidadPromedioCoche;    
    }

    
     /*
     creamos los metodos get y set para poder almacer y mostrar  los datos
     pero como en esta actividad no son encesarios no se ocuparan
     */
     
    public String getModeloCoche() {
        return modeloCoche;
    }

    public void setModeloCoche(String modeloCoche) {
        this.modeloCoche = modeloCoche;
    }

    public String getMarcaCoche() {
        return marcaCoche;
    }

    public void setMarcaCoche(String marcaCoche) {
        this.marcaCoche = marcaCoche;
    }

    public int getVelocidadActualCoche() {
        return velocidadActualCoche;
    }

    public void setVelocidadActualCoche(int velocidadActualCoche) {
        this.velocidadActualCoche = velocidadActualCoche;
    }

    public int getVelocidadPromedioCoche() {
        return velocidadPromedioCoche;
    }

    public void setVelocidadPromedioCoche(int velocidadPromedioCoche) {
        this.velocidadPromedioCoche = velocidadPromedioCoche;
    }
       /*
    creamos el proceso acelerar solo mencionamos la apcion
    por medio de un println.
    */
    public void acelerar()
    {
    System.out.println("Rum Rumm........");
    System.out.println("Vamos con todo ACELERANDO...!!! ");
    }
    
    /*
    creamos la accion frenar iggual con un printtln
    */
    public void frenar()
    {
     System.out.println("Hemos frenado.");    
    }
    
    /*
    creamos la  funcion cargar gas solo retornar un entero
       
    */
    public int cargarGas(int litros)
    {     
        return litros;
    }
    
    /*
    creamos la  funcion cargar cambiar llantas solo retornar un entero
    */
    
    public int cambiarLlantas(int numeroLlanta)
    {
    return numeroLlanta;
    }
    
    /*
    creamos la funcion toString la cual mostrar los datos
    */
    @Override
    public String toString(){
        return "Modelo:"+modeloCoche+ "\n Marca:" +marcaCoche+"\n Velocidad:"+velocidadActualCoche+"\nVelocidad Promedio:"+velocidadPromedioCoche;
    }

    
    
    
    
    
    
    
    
    
    
    
}

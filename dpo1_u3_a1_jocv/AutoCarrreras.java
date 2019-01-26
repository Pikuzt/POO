package dpo1_u3_a1_jocv;

/**
 *
 * @author pikuzt
 */

/*
creamos la clase y hacemos la herencia de coche a auto de carrera.
*/
public class AutoCarrreras extends Coche{
  
    /*
    se crea una variable privadas
    */
     private int rendimiento;

      /*
     creamos los metodos get y set para poder almacer y mostrar  los datos
     pero como en esta actividad no son encesarios no se ocuparan
     */
    public int getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(int rendimiento) {
        this.rendimiento = rendimiento;
    }    
    
    /*
    creamos el constructor de la clase 
    como esta heredando variables solo implementamos la funcion super 
    que para decir que es una variable heredada.
    y creamos la nueva como si fuera normal
    */
    public AutoCarrreras(int rendimiento,String modeloCoche, String marcaCoche, int velocidadActualCoche, int velocidadPromedioCoche){
        super(modeloCoche,marcaCoche,velocidadActualCoche,velocidadPromedioCoche);
        this.rendimiento = rendimiento;           
    }   
    
    /*
    esta clase ya noes necesaria pero comolopide la actividad se crea 
    posiblemente mande  por la llamada de override  pero copilara de todas formas
    solo es la creacion de una funcion que retorbarra el numero de llantas.
    */
     
    /*
    
    @Override
    public int cambiarLlantas(int numeroLlanta)
    {
    return numeroLlanta;
    }   
    
    */
    
    /*    
    creamos la funcion toString la cual mostrar los datos    
    */
     @Override
    public String toString(){
        return "\n Marca:" + "\n Rendimiento:" + rendimiento +"Modelo:"+ modeloCoche +marcaCoche+"\n Velocidad:"+velocidadActualCoche+"\nVelocidad Promedio:"+velocidadPromedioCoche;
    }    
}

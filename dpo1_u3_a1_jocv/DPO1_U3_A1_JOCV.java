package dpo1_u3_a1_jocv;

import java.util.Scanner;
public class DPO1_U3_A1_JOCV {
    public static void main(String[] args) {
        
            /*creamos el arreglo coche en elcual se almacenara 
                */
      Coche carrito[] = new Coche [5];
      
      /*creamos los objetos y al mismo tiempo al macenamos la informacion*/
      carrito[0] = new Coche("suru","nissan",150,120);
      carrito[1] = new AutoCarrreras(98,"ferrari 250","Ferrari",250,180);
      carrito[2]= new AutoDeportivo (1000000,"ferrari 250","Ferrari",250,180);
      
      
      /*
      creamos un recomiento de indice mediante un for
      -llamanos a las demas clases creando polimorfismo
      sobre el arreglo carrito.
      */
       for(  Coche coches: carrito)
      {          
          System.out.println(coches.toString());
          coches.acelerar();
          System.out.println("Alto hay viene la policia wiu wiu wiuuuuuuuu");
          coches.frenar();
          System.out.println(" ");          
          
      }
    }
}

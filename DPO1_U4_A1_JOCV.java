/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo1_u4_a1_jocv;

import java.util.Scanner;

/**
 *
 * @author pikuzt
 */
public class DPO1_U4_A1_JOCV {

   
    public static void main(String[] args) {
        
            /*declaramoslos arreglos*/
        Scanner sc = new Scanner(System.in);
        String [] nombre = new String[10];
        int[] edad = new int[10];
        float[] altura = new float[10];
        float[] peso = new float [10];
        
        //creamos la matriz
        String Data[][] = new String [4][10];
        
        
       
        /*Pedimos los datos de cada arreglo*/
        for (int i=0; i<edad.length; i++ )
        {            
            System.out.println("Ingrese datos de la persona "+(i+1));
            System.out.print((i+1)+".-Ingresa el nombre:");
            nombre[i]= sc.next();
            sc.nextLine();
            System.out.print((i+1)+".-Ingresa edad:");
            edad[i]= sc.nextInt();            
            System.out.print((i+1)+".-Ingresa altura:");
            altura[i]=sc.nextFloat();            
            System.out.print((i+1)+".-Ingresa peso:");
            peso[i]=sc.nextFloat();
        }  
        
        //implomimos los arrglos en un orden  de forma de objeto  Persona:
        for(int i=0;i<edad.length;i++)
        {
            System.out.println((i+1)+".-Datos de la primera persona "+"posicion del arreglo["+i+"]:"+nombre[i]+","+edad[i]+","+altura[i]+","+peso[i]);
        }        
        /*llenamos la matriz con los arreglos en este caso converti los 
        datos numericos a string con valueof*/
              System.out.println("Datos de matriz:");
            for(int columna = 0;columna<edad.length;columna++)
            {
                Data[0][columna] = nombre[columna];
                Data[1][columna] = String.valueOf(edad[columna ]);
                Data[2][columna] = String.valueOf(altura[columna]);
                Data[3][columna] = String.valueOf(peso[columna]);  
                
                System.out.println("[0]["+columna+"]"+Data[0][columna]);
                System.out.println("[1]["+columna+"]"+Data[1][columna]);
                System.out.println("[2]["+columna+"]"+Data[2][columna]);
                System.out.println("[3]["+columna+"]"+Data[3][columna]);
            } 
    }
}

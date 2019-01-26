/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo1_u4_a2_jocv;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author pikuzt
 */
public class DPO1_U4_A2_JOCV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaramos los arreglos 
            int [] arr = new int[40];
            int [] pares = new int [40];
            int [] impares =new int [40];
            
            
            //llenamos el arreglo de tamaño 40  con 40 numeros;
            llenandoArr(arr); 
            ordImpaPar(arr,pares,impares);
            
            /*
            mandamos a llamar los metodos en en em main principal 
            */
            System.out.print("\n");
            System.out.println("El arreglo es:");
            mostraArr(arr);
            
            System.out.print("\n");
            System.out.println("El arreglo con numeros pares es:");
            mostraArr(pares);
            
            ordenAscendentePar(pares);
            System.out.print("\n");            
            System.out.println("El arreglo con numeros impares es:");
            mostraArr(pares);
            
            ordenDescententePar(pares);
            System.out.print("\n");
            System.out.println("orden Ascendente pares:");
            mostraArr(pares);   
            
            ordenAscendentePar(pares);
            System.out.print("\n");
            System.out.println("orden Decententes pares:");
            mostraArr(pares); 
            
            ordenDescendenteImpar(impares);
            System.out.print("\n");
            System.out.println("orden decendente impar:");   
            mostraArr(impares); 
             
            ordenAscendenteImpar(impares);
            System.out.print("\n");
            System.out.println("orden ascendente impar:");   
            mostraArr(impares); 
        
    }
    
    /*
    creacion de un for con el arreglo el cual se llenara con de numero 
    aleatorios con la MAtch.random.
    */
    public static void llenandoArr(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
            {
                arr[i]= (int)(Math.random()*150)+1;
            }
    }
    
    /*
    mostramos el arreglo
    */
    public static void mostraArr(int[] arr)
    {       
            for(int i: arr)
            {
                System.out.print(i+",");
            } 
    }
    
    /*
    ordenamos los numeros en dos arreglos uno sera impar y el otro par.
    */
    public static void ordImpaPar(int[] arr, int[] pares,int impares[])
    {
        for(int i=0; i<arr.length;i++)
            {
                if (arr[i]%2==0)
                {
                    pares[i] = arr[i];
                }else{
                    impares[i]=arr[i];
                }            
            } 
    }
    
    /*
    aplicamos el metodo burbuja para aordenar  de forma descendente
    */
    
    public static void ordenDescententePar(int[] pares)
    {
            for (int x = 0; x < pares.length; x++) {
            for (int i = 0; i < pares.length-x-1; i++) {
                if(pares[i] < pares[i+1]){
                    int tmp = pares[i+1];
                    pares[i+1] = pares[i];
                    pares[i] = tmp;
                }
            }
        }
    }
    
    /*
    aplicamos el metodo burbuja para ordenar  de forma ascendente
    */
    public static void ordenAscendentePar(int[] pares)
    {
        for (int x = 0; x < pares.length; x++) {
                for (int i = 0; i < pares.length-x-1; i++) {
                if(pares[i] > pares[i+1]){
                    int tmp = pares[i+1];
                    pares[i+1] = pares[i];
                    pares[i] = tmp;
                }
            }
        }       
    }
    
    public static void ordenDescendenteImpar(int [] impares)
    {
        for (int x = 0; x < impares.length; x++) {
                for (int i = 0; i < impares.length-x-1; i++) {
                if(impares[i] < impares[i+1]){
                    int tmp = impares[i+1];
                    impares[i+1] = impares[i];
                    impares[i] = tmp;
                }
            }
        }
    }
    
    public static void ordenAscendenteImpar(int[] impares)
    {
        for (int x = 0; x < impares.length; x++) {
                for (int i = 0; i < impares.length-x-1; i++) {
                if(impares[i] > impares[i+1]){
                    int tmp = impares[i+1];
                    impares[i+1] = impares[i];
                    impares[i] = tmp;
                }
            }
        }
    }
}

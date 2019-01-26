/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo1_u4_ea_jocv;

import java.util.Scanner;

/**
 *
 * @author pikuzt
 */
public class DPO1_U4_EA_JOCV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*
        -Retoma el planteamiento de la actividad 1 y desarrolla un sistema donde 
        se ingresen los datos de 10 pacientes donde se realicen los cálculos 
        siguientes:

•	Índice de Masa Corporal.
•	Calculo de Gasto de kilocalorías de acuerdo a su nivel de actividad física 
        (integra las variables o elementos faltantes).
•	Clasifica los grupos de personas por estado nutricional de acuerdo 
        con el IMC.
        */
        
        /*declaramoslos arreglos*/
        Scanner sc = new Scanner(System.in);
        String [] nombre = {"carlos","liliana","juan","obeb","cristian","pepe","ivan","jazmin","liliana","david"};
        int[] edad = {15,20,58,24,14,26,42,36,45,47,29};
        float[] altura = {1.72f,1.80f,2.00f,1.50f,1.40f,1.60f,1.70f,1.40f,1.60f,1.70f};
        float[] peso = {40,55,75,80,91,86,72,54,62,74};
        float[] imc = new float [10];
        float [] metabolismo = new float[10];       
        
        //creamos la matriz
        String Data[][] = new String [6][10];
        
        imcMetabolismo(imc,metabolismo,peso,altura,edad);
        //mostraPersonas(imc,metabolismo,peso,altura,edad,nombre);        
        clasificacion(imc,metabolismo,peso,altura,edad,nombre);
   }
    
    public static void imcMetabolismo(float[] imc, float[] metabolismo,float[] peso, float[] altura,int[]edad)
    {
        for(int i=0; i< 10; i++)
        {
          imc[i]= peso[i]/altura[i]; 
          metabolismo[i] = (float) (66.473f + (13.751f + peso[i])+(5.003f + altura[i])-(6.7550f + edad[i])); 
        }
    }
    public static void mostraPersonas(float[] imc, float[] metabolismo,float[] peso, float[] altura,int[]edad, String [] nombre)
    {
    //implomimos los arrglos en un orden  de forma de objeto  Persona:
        for(int i=0;i< 10;i++)
        {
        System.out.println((i+1)+".-Datos de la primera persona\n "+"Nombre:"
                          +nombre[i]+"\nEdad:"+edad[i]+"\nAltura:"+altura[i]+"\nPeso:"+peso[i]+
                          "\nIMC"+imc[i]+"\nMetabolimos:"+metabolismo[i]);}     
    }
    
    public static void clasificacion(float[] imc, float[] metabolismo,float[] peso, float[] altura,int[]edad, String [] nombre)
    {
        System.out.println("Clasificacion:");
            for(int i = 0;i< 10;i++)
            {
                if(( imc[i] >= 18.5) &&(imc[i]<= 24.99))
                {
                  System.out.println("Tiene peso normal");
                  System.out.println((i+1)+".-Datos de la primera persona\n "+"Nombre:"
                          +nombre[i]+"\nEdad:"+edad[i]+"\nAltura:"+altura[i]+"\nPeso:"+peso[i]+
                          "\nIMC"+imc[i]+"\nMetabolimos:"+metabolismo[i]);
                }else if(( imc[i] >= 25) &&(imc[i]<= 25.99) )
                {
                  System.out.println("Tiene sobre peso");
                  System.out.println("------------------------------------------------");
                  System.out.println((i+1)+".-Datos de la primera persona\n "+"Nombre:"
                          +nombre[i]+"\nEdad:"+edad[i]+"\nAltura:"+altura[i]+"\nPeso:"+peso[i]+
                          "\nIMC"+imc[i]+"\nMetabolimos:"+metabolismo[i]);
                }else if(( imc[i] >= 26) &&(imc[i]<= 29.99))
                {
                  System.out.println("Es pre-obeso");
                  System.out.println("------------------------------------------------");
                  System.out.println((i+1)+".-Datos de la primera persona\n "+"Nombre:"
                          +nombre[i]+"\nEdad:"+edad[i]+"\nAltura:"+altura[i]+"\nPeso:"+peso[i]+
                          "\nIMC"+imc[i]+"\nMetabolimos:"+metabolismo[i]);
                }else if(( imc[i] >= 30) &&(imc[i]<= 30.99))
                {                    
                  System.out.println("Es obeso");
                  System.out.println("------------------------------------------------");
                  System.out.println((i+1)+".-Datos de la primera persona\n "+"Nombre:"
                          +nombre[i]+"\nEdad:"+edad[i]+"\nAltura:"+altura[i]+"\nPeso:"+peso[i]+
                          "\nIMC"+imc[i]+"\nMetabolimos:"+metabolismo[i]);           
                }else if(( imc[i] >= 30) &&(imc[i]<= 34.99))
                {                    
                  System.out.println("Es obeso tipo 1");
                  System.out.println("------------------------------------------------");
                  System.out.println((i+1)+".-Datos de la primera persona\n "+"Nombre:"
                          +nombre[i]+"\nEdad:"+edad[i]+"\nAltura:"+altura[i]+"\nPeso:"+peso[i]+
                          "\nIMC"+imc[i]+"\nMetabolimos:"+metabolismo[i]);           
                }else if(( imc[i] >= 35) &&(imc[i]<= 39.99))
                {                    
                  System.out.println("Es obeso tipo 2");
                  System.out.println("------------------------------------------------");
                  System.out.println((i+1)+".-Datos de la primera persona\n "+"Nombre:"
                          +nombre[i]+"\nEdad:"+edad[i]+"\nAltura:"+altura[i]+"\nPeso:"+peso[i]+
                          "\nIMC"+imc[i]+"\nMetabolimos:"+metabolismo[i]);           
                }else if(( imc[i] >= 40))
                {                    
                  System.out.println("Es obeso tipo 3");
                  System.out.println("------------------------------------------------");
                  System.out.println((i+1)+".-Datos de la primera persona\n "+"Nombre:"
                          +nombre[i]+"\nEdad:"+edad[i]+"\nAltura:"+altura[i]+"\nPeso:"+peso[i]+
                          "\nIMC"+imc[i]+"\nMetabolimos:"+metabolismo[i]);           
                }
               
            }     
    }
    
    
    
}

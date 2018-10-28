/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo1_u2_a2_jocv;

import java.util.Scanner;

/**
 * Cleado
 *
 * @author carlos
 */
public class DPO1_U2_A2_JOCV {

    
    public static void main(String[] args) {
        //int boletos = 0;
         
        int op;
        Scanner sc = new Scanner(System.in); 
        menuAerolinea();
        System.out.println("seleccione destino:");
        op = sc.nextInt();
        
        switch(op){
           
            case  1:                
                opcion1();                              
                break;
            case  2:                
                opcion2();                
                break;
            case  3:  
                opcion3();
            ;break;
            case  4: 
                 opcion4();
                ;break;
                
            default:
            System.out.println("este valor no es valido.");
            break;
                        
        }              
    }
    
    private static void menuAerolinea(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|"+"Ruta"+"|                                "+"        Costo"+"|");
        System.out.println("|"+"1.-México-New York, New-York-México"+"    |    " +"$100 usd");
        System.out.println("|"+"2.-Mexico-Paris, Paris-México"+"          |    "+"$800 euros");
        System.out.println("|"+"3.-Mexico-Madrid, Madrid-México"+"        |    "+"$650 euros");
        System.out.println("|"+"4.-Mexico-Sao Paulo, Sao Paulo-México"+"  |  "+"  $12, 500 MXN");        
        System.out.println("------------------------------------------------------------------------");        
    }
    
    private static void asignarEdades(int [] edades){     
    
        Scanner sc = new Scanner(System.in); 
        
        for(int i=0; i< edades.length; i++){
            System.out.print("Cual es la edad  para el primer boleto " + i + ": ");
            edades[i] = sc.nextInt();
        }
    }
    
    //se crea la funcion conversion a dolares 
    private static double convercionDolar (double dolar){              
       return dolar * 17.80;      
   }
    //se crea la funcion conversion a Euros 
    private static double convercionEuros(double euros){
        return euros * 22.24;
    }   
    ////se crea  el descuento del 60%  
    private static double des60May( double precio){
            return (precio * 60/100);    
    }
    //se crea  el descuento del 35% 
    private static double des35Adole(double precio){
        return (precio *35/100);
    }
    //se crea  el descuento del 35% 
    private static double des35Men(double precio){
        return (precio *35/100);
    }
    
    private static double iva(double iva){
        return (iva +(iva * .16)) ;        
    }
    
    //aplicamos 4 metodos para cada destino.
    private static void opcion1(){
        //Declaracion de variables para precio y boletos.
        double precio = 100;
        int boletos = 0;
        Scanner sc = new Scanner(System.in);
                System.out.println("Cuantos boletos comprara:");
                boletos = sc.nextInt();                
                System.out.println("voletos comprados"+boletos);                            
                int[] edades = new int [boletos];
                asignarEdades(edades);   
                
                double precioBoleto; 
                double Pago;
                double convercion;
                double pagoTotal =0;
                //String estudiante;
                //se aplica un for para recorrer el array y realizar las operaciones 
                //por cada edad.
                for(int i=0;i<edades.length;i++){
                    
                    //se realiza laoperacion dependiendo la edad sera el descuento
                    //que se aplique.
                    if(edades[i] >= 60){
                             precioBoleto = des60May(precio);
                             convercion = convercionDolar(precioBoleto);
                             Pago = iva(convercion);
                             pagoTotal = pagoTotal + Pago;                             
                             
                    }else if((edades[i]>=18)&&(edades[i]<=29)){
                             precioBoleto = des35Adole(precio);
                             convercion = convercionDolar(precioBoleto);
                             Pago = iva(convercion);
                             pagoTotal = pagoTotal + Pago;  
                                              
                    }else if((edades[i]>=0)&&(edades[i]<=17)){
                        precioBoleto = des35Adole(precio);
                        convercion = convercionDolar(precioBoleto);
                        Pago = iva(convercion);
                        pagoTotal = pagoTotal + Pago;
                    }else if((edades[i]>=30)&& (edades[i]<=59)){
                        precioBoleto = precio;
                        convercion = convercionDolar(precioBoleto);
                        Pago = iva(convercion);
                        pagoTotal = pagoTotal + Pago;
                    }
                }
                
                //Mostramos la sumatoria Totan ya on el iva incluido
                System.out.println("El pago Total es: $"+pagoTotal);
    }
    
    private static void opcion2(){
        double precio = 800;
        int boletos = 0;
        Scanner sc = new Scanner(System.in);
                System.out.println("Cuantos boletos comprara:");
                boletos = sc.nextInt();                
                System.out.println("voletos comprados"+boletos);                            
                int[] edades = new int [boletos];
                asignarEdades(edades);   
                
                double precioBoleto; 
                double Pago;
                double convercion;
                double pagoTotal =0;
                //String estudiante;
                
                for(int i=0;i<edades.length;i++){
                    
                    if(edades[i] >= 60){
                             precioBoleto = des60May(precio);
                             convercion = convercionEuros(precioBoleto);
                             Pago = iva(convercion);
                             pagoTotal = pagoTotal + Pago;                             
                             
                    }else if((edades[i]>=18)&&(edades[i]<=29)){
                             precioBoleto = des35Adole(precio);
                             convercion = convercionEuros(precioBoleto);
                             Pago = iva(convercion);
                             pagoTotal = pagoTotal + Pago;  
                                              
                    }else if((edades[i]>=0)&&(edades[i]<=17)){
                        precioBoleto = des35Adole(precio);
                        convercion = convercionEuros(precioBoleto);
                        Pago = iva(convercion);
                        pagoTotal = pagoTotal + Pago;
                    }else if((edades[i]>=30)&& (edades[i]<=59)){
                        precioBoleto = precio;
                        convercion = convercionEuros(precioBoleto);
                        Pago = iva(convercion);
                    }
                }
                
                System.out.println("Total a pagar es: $"+pagoTotal);
    }
    
    private static void opcion3(){
        double precio = 650;
        int boletos = 0;
        Scanner sc = new Scanner(System.in);
                System.out.println("Cuantos boletos comprara:");
                boletos = sc.nextInt();                
                System.out.println("voletos comprados"+boletos);                            
                int[] edades = new int [boletos];
                asignarEdades(edades);   
                
                double precioBoleto; 
                double Pago;
                double convercion;
                double pagoTotal =0;
                //String estudiante;
                
                for(int i=0;i<edades.length;i++){
                    
                    if(edades[i] >= 60){
                             precioBoleto = des60May(precio);
                             convercion = convercionEuros(precioBoleto);
                             Pago = iva(convercion);
                             pagoTotal = pagoTotal + Pago;                             
                             
                    }else if((edades[i]>=18)&&(edades[i]<=29)){
                             precioBoleto = des35Adole(precio);
                             convercion = convercionEuros(precioBoleto);
                             Pago = iva(convercion);
                             pagoTotal = pagoTotal + Pago;  
                                              
                    }else if((edades[i]>=0)&&(edades[i]<=17)){
                        precioBoleto = des35Adole(precio);
                        convercion = convercionEuros(precioBoleto);
                        Pago = iva(convercion);
                        pagoTotal = pagoTotal + Pago;
                    }else if((edades[i]>=30)&& (edades[i]<=59)){
                        precioBoleto = precio;
                        convercion = convercionEuros(precioBoleto);
                        Pago = iva(convercion);
                        pagoTotal = pagoTotal + Pago;
                    }
                }
                
                System.out.println(pagoTotal);
    }
    
    private static void opcion4(){
        double precio = 12500;
        int boletos = 0;
        Scanner sc = new Scanner(System.in);
                System.out.println("Cuantos boletos comprara:");
                boletos = sc.nextInt();                
                System.out.println("voletos comprados"+boletos);                            
                int[] edades = new int [boletos];
                asignarEdades(edades);   
                
                double precioBoleto; 
                double Pago;
                double convercion;
                double pagoTotal =0;
                //String estudiante;
                
                for(int i=0;i<edades.length;i++){
                    
                    if(edades[i] >= 60){
                             precioBoleto = des60May(precio);
                             //convercion = convercionDolar(precioBoleto);
                             Pago = iva(precioBoleto);
                             pagoTotal = pagoTotal + Pago;                             
                             
                    }else if((edades[i]>=18)&&(edades[i]<=29)){
                             precioBoleto = des35Adole(precio);
                             //convercion = convercionDolar(precioBoleto);
                             Pago = iva(precioBoleto);
                             pagoTotal = pagoTotal + Pago;  
                                              
                    }else if((edades[i]>=0)&&(edades[i]<=17)){
                        precioBoleto = des35Adole(precio);
                        //convercion = convercionDolar(precioBoleto);
                        Pago = iva(precioBoleto);
                        pagoTotal = pagoTotal + Pago;
                    }else if((edades[i]>=30)&& (edades[i]<=59)){
                        precioBoleto = precio;
                        //convercion = convercionDolar(precioBoleto);
                        Pago = iva(precioBoleto);
                        pagoTotal = pagoTotal + Pago;
                    }
                }
                
                System.out.println(pagoTotal);
    }
    
    
}

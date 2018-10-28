/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo1_u2_a3_jocv;

import java.util.Scanner;

/**
 *
 * @author pikuzt
 */
public class DPO1_U2_A3_JOCV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entero;
        Scanner sc = new Scanner(System.in);
        
        leer();
        entero = sc.nextInt();         
        //System.out.println(entero);
        
       Collatz(entero);               
    }    
    private static void leer(){        
        System.out.print("ingresa un numero:");        
    }
    private static void  Collatz (int ingreNumero){
        
        while(ingreNumero != 1){
            if(ingreNumero % 2 == 0){
            
                System.out.print(imprimir(ingreNumero) + ",");           
                ingreNumero = ingreNumero / 2;
                    
            
            }else {
                System.out.print(imprimir(ingreNumero) + ",");               
                ingreNumero = (ingreNumero * 3) + 1;               
            }  if(ingreNumero ==1){
                System.out.print( "1");
            }     
                       
        }        
    }
    
    private static int imprimir (int entero){
        return entero;        
    }
     
    
}

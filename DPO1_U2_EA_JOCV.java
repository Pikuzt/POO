/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo1_u2_ea_jocv;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pikuzt
 * 
 * Universidad Abierta y Adistancia de Mexico.
 * creado:27/10/2018
 */

/*
Una empresa que se dedica a la venta de productos plásticos, 
necesita un programa para administrar sus facturas.

En cada factura figura: el código del artículo, nombre del artículo, 
la cantidad vendida en piezas y el precio por pieza, 
estos datos los deberá proporcionar el usuario.

El programa deberá tener la opción de mostrar los datos de facturación, 
captura de datos, por ultimo deberá mostrar el total acumulado 
del importe de las facturas. El programa deberá ejecutarse hasta que el usuario desee salirse.
Como restricciones deberás utilizar estructuras selectivas, cíclicas, y métodos.

*/
public class DPO1_U2_EA_JOCV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*creando listas para almacenar datos indefinidamente.*/
        
        ArrayList<String> codigoFactura= new ArrayList<String>();
        ArrayList<String> nombreFactura= new ArrayList<String>();
        ArrayList<Integer> canVendidos= new ArrayList<Integer>();
        ArrayList<String> precioUnidad= new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int op;        
        
        //int op = sc.nextInt();
        
        //creando Do while para que se repita hazta ingresar el valor de salida.
        
        do{
           menuFacturacion();       
            System.out.println("Seleccione una opcion:"); 
            op = sc.nextInt();
            
            
            
          
            
            switch(op){
            case 1: 
                registrandoCodigo(codigoFactura);
                registrandoNombre(nombreFactura);
                registrandoVendidos(canVendidos);
                registrarPrecio(precioUnidad);
                
                break;
                
            case 2: mostrarListaFactura(codigoFactura,
                    nombreFactura,
                    canVendidos,
                    precioUnidad); 
            
            break;
            
            case 3: 
                acumulado(codigoFactura,
                    nombreFactura,
                    canVendidos,
                    precioUnidad);
            break;
            
            default:
            System.out.println("este valor no es valido.");
            break;
        }     
            
        }while(op != 4);
        
        System.out.println(" Adios");  
        
    }
    /*
    creando el metodo menu
    */
    public static void menuFacturacion(){
        System.out.println(" Funciones de la facturacion ");
        System.out.println(" 1.- Capturar Nueva  Factura ");
        System.out.println(" 2.- Mostrar Datos  de la factura");
        System.out.println(" 3.-Total Acumulado");   
        System.out.println(" 4.-Salir");  
        
    }
    
    /*
    creando el metodo registrar mediante los metodos .add 
    que es agregar ala lista de la arraLIst.
    */
    public static void registrandoCodigo (ArrayList<String> codigo){        
        Scanner sc = new Scanner(System.in);        
        System.out.println("Ingresa codigo:");
        String cod = sc.nextLine();
        codigo.add(cod);    
    }
    
    /*
    creando el metodo registrar mediante los metodos .add 
    que es agregar ala lista de la arraLIst.
    */
    public static void registrandoNombre (ArrayList<String> nombre){        
        Scanner sc = new Scanner(System.in);        
        System.out.println("Ingresa Nombre:");
        String nom = sc.nextLine();
        nombre.add(nom);    
    }
    
    /*
    creando el metodo registrar mediante los metodos .add 
    que es agregar ala lista de la arraLIst.
    */
    public static void registrandoVendidos(ArrayList<Integer> vendidos){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingresa cantidad vendidas:");
        int cantida =sc.nextInt();
        vendidos.add(cantida);
    }
    
    /*
    creando el metodo registrar mediante los metodos .add 
    que es agregar ala lista de la arraLIst.
    */
    public static void registrarPrecio(ArrayList<String> unidad){
        Scanner sc = new Scanner(System.in);
        System.out.println("precio por pieza:");
        String precio = sc.nextLine();
        unidad.add(precio); 
    }
    
    
    /*
    mostramos la lista  por medio de un for y mandamos llamar los arrlist para 
    para eso se ocupa el metodo de arralist .get =mostrar dato     
    */
    public static void mostrarListaFactura(ArrayList<String> codigo,ArrayList<String> nombre,ArrayList<Integer> vendidos,ArrayList<String> unidad){
        System.out.println("Mostrando datos:");
        System.out.println("\t| Codigo \t|\t nombre \t|\t unidades vendidas \t|\t precio por unidad \t|");
        int tam =codigo.size();
        for(int i=0; i<tam;i++){
            System.out.println("\t|\t"+ codigo.get(i)+"\t|\t\t"+ nombre.get(i)+"\t|\t\t"+vendidos.get(i)+"\t\t|\t\t"+unidad.get(i) +"\t\t|");
        }      
        
    }
    
    /*
    Mostramos los datos con la suma de amulados por factura y el total  de las facturas,
    mediante un metodo.
    */
    public static void acumulado(ArrayList<String> codigo,ArrayList<String> nombre,ArrayList<Integer> vendidos,ArrayList<String> unidad){
        System.out.println("Mostrando:");
        System.out.println("\t| Codigo \t|\t nombre \t|\t unidades vendidas \t|\t precio por unidad \t|\t Acumulado por factura |");
        double totalAcum =0;
        int tam =codigo.size();
        for(int i=0; i<tam;i++){
            System.out.println("\t|\t"+ codigo.get(i)+"\t|\t\t"+ nombre.get(i)+"\t|\t\t"+vendidos.get(i)+"\t\t|\t\t"+unidad.get(i) +"\t\t|\t"+totalAcumulado(vendidos,unidad,i));
            
        totalAcum = (totalAcum + totalAcumulado(vendidos,unidad,i));
        } 
        System.out.println("......................................................");        
        System.out.println("El tota  Acumulado es:"+totalAcum);
        System.out.println("......................................................");
        
    }  
    
    
    /*
    se creo una funcion para  realizar la multiplicacion de  de unidades  * precio
    para eso se convierte el string a double con la funcion 
    Double.parseDouble(Aqui la arraylist)
    y se retorna el total como resultado
    */
    
    public static double totalAcumulado(ArrayList<Integer> vendidos,ArrayList<String> unidad,int indice){
        double Total;        
           //Total = vendidos.get(indice) * unidad.get(indice);   
           Total = vendidos.get(indice)* Double.parseDouble(unidad.get(indice));
        return Total;
    }
    
       
}

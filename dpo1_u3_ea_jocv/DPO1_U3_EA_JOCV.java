/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo1_u3_ea_jocv;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pikuzt
 */
public class DPO1_U3_EA_JOCV {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //declaracion de  opbjeros almacenadosen un arreglo.
        Scanner sc = new Scanner(System.in);    
        Persona arrEmp[] = new Empleado[5];
        Persona arrCli[] = new Cliente[5];
        Libro arrLibro[] = new Libro[5];  
        Prestamo arrPres[] = new Prestamo[5];
       
        
        //llenando la  de datos los arreglos
        arrEmp[0]= new Empleado("Juan","Perez",25,"78-98-96-4","111NIE15","vazconcelos","limones",457);
        arrEmp[1]= new Empleado("Yazmin","Ceballos",26,"78-98-78-98","111","Reserva","Caxa",14);
        arrCli[0]= new Cliente("Carlos","Castillo",29,"78-98-77854","1254NEW","Limones","Caxa",57);
        arrCli[1]= new Cliente("Josue","Santos",27,"78-98-854","12NEW","Limones","Caxa",80);
        arrLibro[0]= new Libro("Harry Potter","J.K. Rowling","Española","Tomo 1");
        arrLibro[1]= new Libro("Harry Potter 2","J.K. Rowling","Española","Tomo 2");
        arrPres[0] = new Prestamo( 5,2018,7,11,2018,5,15,2,5);       
        Prestamo press = new Prestamo(5,2018,7,11,2018,5,15,2,5);        
        
        
        
        /*
        secra una variablepara el menu y switch para cada funcion del menu.
        */
        int op;
        do{
            menu();
            op =sc.nextInt();
            
            switch(op){
            case 1: 
                    System.out.println("Lista de Empleados");
                    System.out.println(arrEmp[0].toString());
                    System.out.println(arrEmp[1].toString());
                
                ;break;
            case 2: 
                    System.out.println("Lista de Cliente");
                    System.out.println(arrCli[0].toString());
                    System.out.println(arrCli[1].toString());
                ;break;
            case 3: 
                    System.out.println("Lista de Libros");
                    System.out.println(arrCli[0].toString());
                    System.out.println(arrCli[1].toString());
                ;break;
            case 4: 
                press.incrementerDisponiblesLibro();
                ;break;
            case 5: 
                press.decrementarDisponiblesLibros();
                ;break; 
                
            case 6:
            press.validandoFechaPrestamo();
            break;
            }      
        }while(op != 7);  
        
  }      
    
    
    //creacion de menu 
    public static void menu()
    {
        System.out.println("Que desea realizar:");
        System.out.println("1.-Lista de empleados.");
        System.out.println("2.-Lista de clientes");
        System.out.println("3.-Lista de libros.");
        System.out.println("4.-Agregar disponibles.");
        System.out.println("5.-Descontar disponibles.");
        System.out.println("6.-Validando prestamos.");
        System.out.println("7.-Salir.");
        
    }
}


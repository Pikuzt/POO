
package dpo1_u3_ea_jocv;

import java.util.Scanner;


/* se crea  un una clase prestamo  en la cual cuenta con las variables privadas
un constructos  y sus get y set
*/
public class Prestamo  {
   
    private int prestamoMes;
    private int prestamoAnio;
    private int prestamosDia;
    private int entregaMes;
    private int entregaAnio;
    private int entregaDia;
    private int Disponibles;
    private int stk_min;
    private int stk_max;

    
    
    public Prestamo(int prestamoMes, int prestamoAnio, int prestamosDia, int entregaMes, int entregaAnio, int entregaDia, int Disponibles, int stk_min, int stk_max) {
        this.prestamoMes = prestamoMes;
        this.prestamoAnio = prestamoAnio;
        this.prestamosDia = prestamosDia;
        this.entregaMes = entregaMes;
        this.entregaAnio = entregaAnio;
        this.entregaDia = entregaDia;
        this.Disponibles = Disponibles;
        this.stk_min = stk_min;
        this.stk_max = stk_max;
    } 

    public int getPrestamoMes() {
        return prestamoMes;
    }

    public void setPrestamoMes(int prestamoMes) {
        this.prestamoMes = prestamoMes;
    }

    public int getPrestamoAnio() {
        return prestamoAnio;
    }

    public void setPrestamoAnio(int prestamoAnio) {
        this.prestamoAnio = prestamoAnio;
    }

    public int getPrestamosDia() {
        return prestamosDia;
    }

    public void setPrestamosDia(int prestamosDia) {
        this.prestamosDia = prestamosDia;
    }

    public int getEntregaMes() {
        return entregaMes;
    }

    public void setEntregaMes(int entregaMes) {
        this.entregaMes = entregaMes;
    }

    public int getEntregaAnio() {
        return entregaAnio;
    }

    public void setEntregaAnio(int entregaAnio) {
        this.entregaAnio = entregaAnio;
    }

    public int getEntregaDia() {
        return entregaDia;
    }

    public void setEntregaDia(int entregaDia) {
        this.entregaDia = entregaDia;
    }

    public int getDisponibles() {
        return Disponibles;
    }

    public void setDisponibles(int Disponibles) {
        this.Disponibles = Disponibles;
    }

    public int getStk_min() {
        return stk_min;
    }

    public void setStk_min(int stk_min) {
        this.stk_min = stk_min;
    }

    public int getStk_max() {
        return stk_max;
    }

    public void setStk_max(int stk_max) {
        this.stk_max = stk_max;
    }

    /*
    creamo una variable para incrementar el 
    libro disponible asi mismo se aplico un try catch  finally 
    para  mostrarc ellos de numeros con decima solo se almiten numeros enteros.
    */
    public void incrementerDisponiblesLibro(){    
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos libros Registrara:");
        try{            
         int acum = sc.nextInt();
         Disponibles = Disponibles + acum;
         System.out.println(Disponibles);        
         
        } catch(Exception e){
            System.out.println("No se almiten numeros decimales.");
            System.err.println("Exception caught: " + e.getMessage());
        }
        finally{
            System.out.println("Proceso terminado.");
        }
        
    }    
    
     /*
    creamo una variable para decrementar el 
    libro disponible asi mismo se aplico un try catch  finally 
    para  mostrarc ellos de numeros con decima solo se almiten numeros enteros.
    */
    public void decrementarDisponiblesLibros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos libros Eliminaras:");
        try{            
         int acum = sc.nextInt();
         Disponibles = Disponibles - acum;
         
         if(Disponibles != 0){
             System.out.println("0");             
         }else{
             System.out.println( "libros disponibles:"+Disponibles); 
         }              
         
        } catch(Exception e){
            System.out.println("No se almiten numeros decimales.");
            System.err.println("Exception caught: " + e.getMessage());
        }
        finally{
            System.out.println("Proceso terminado.");
        }       
    }
     /*
    validamos las fechas para poder entregar el libro
    */
    public void validandoFechaPrestamo(){
        
        if (!((prestamosDia != entregaDia) & (prestamoMes != entregaMes)& (prestamoAnio != entregaAnio))){ 
            
            System.out.println(" Prestamo:"+prestamosDia+"/"+prestamoMes+"/"+prestamoAnio);
            System.out.println(" Entregada del Prestamo:"+entregaDia+"/"+entregaMes+"/"+entregaAnio);
            System.out.println(" La fecha del prestamo es valido.");
            System.out.println("Por favor pasa a dejar el libro con el encargado.");
    } else { 
            System.out.println(" Prestamo:"+prestamosDia+"/"+prestamoMes+"/"+prestamoAnio);
            System.out.println(" Prestamo:"+entregaDia+"/"+entregaMes+"/"+entregaAnio);
            System.out.println(" La fecha del prestamo no es valido.");
        }    
    
    }

    @Override
    public String toString() {
        return "Prestamo{" + "prestamoMes=" + prestamoMes + ", prestamoAnio=" + prestamoAnio + ", prestamosDia=" + prestamosDia + ", entregaMes=" + entregaMes + ", entregaAnio=" + entregaAnio + ", entregaDia=" + entregaDia + ", Disponibles=" + Disponibles + ", stk_min=" + stk_min + ", stk_max=" + stk_max + '}';
    }
    
    
    
    
            
    
    
    
}

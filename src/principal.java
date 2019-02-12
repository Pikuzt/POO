import javax.swing.*;

public class principal {

    public static void main(String[] args) {

        //Creamos la ventana y con la llamada del constructor ventana.
        ventana  obj = new ventana();
        obj.setTitle("Menu tarea");
        obj.setSize(500,500);
        obj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        obj.setVisible(true);


    }
}

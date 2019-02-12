import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ventana extends JFrame {

    //Creamo las variables a ocupar;
    JMenuBar barra;
    JMenu menu;
    JMenuItem ventas;
    JMenuItem inventario;
    JMenuItem personal;
    JMenuItem salir;



    public ventana (){

        //creamosel constructor menu el cual llamara  al metodo privado.
        crearMenu();

    }

    private void crearMenu (){

        //creamos el objeto JMenuBar para crear la barra en la ventana
        barra = new JMenuBar();

        //JMEnu para defini el menu raiz
        menu = new JMenu("Menu");

        //Creamos los submenos  con JMENUIITEM
        ventas = new JMenuItem("Ventas");
        inventario = new JMenuItem("Inventario");
        personal = new JMenuItem("Personal");
        salir = new JMenuItem("Salir");

        //damos el orden en que van aparecen en el menu con ADD
        menu.add(ventas);
        menu.add(inventario);
        menu.add(personal);
        menu.add(salir);
        barra.add(menu);

        //mostramos la barra
        setJMenuBar(barra);

        //mostramos mensaje de alerta para cada submeno en el caso de salir ce cierra el programa

        ventas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Ventas");
            }
        });

        inventario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Inventario");
            }
        });

        personal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Personal");
            }
        });

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Acaba de salir adios");
                System.exit(0);
            }
        });

    }
}

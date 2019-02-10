package View;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewPantallaPrincipal {
    private JButton nuevoClienteButton;
    private JPanel panel1;
    public ViewPantallaPrincipal(){

        nuevoClienteButton.setSize(80, 30);

        nuevoClienteButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ViewCrearCliente cliente= new ViewCrearCliente();
                cliente.setVisible(true);
                super.mouseClicked(e);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ViewPantallaPrincipal");
        frame.setContentPane(new ViewPantallaPrincipal().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame. setSize(1500,700);
    }
}

package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewCrearCliente extends JFrame {

    private JLabel etiqNombre;
    private JTextField textNombre;
    private JLabel etiqApellido;
    private JTextField textApellido;
    private JLabel etiqDni;
    private JTextField textDni;
    private JButton btnAceptar;
    private JButton btnCancelar;

    public ViewCrearCliente(){
        setTitle("Nuevo Cliente");
        setSize(450, 230);
        setLayout(null);
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        etiqNombre=new JLabel() ;
        textNombre= new JTextField();
        etiqApellido= new JLabel();
        textApellido=new JTextField();
        etiqDni=new JLabel();
        textDni=new JTextField();
        btnAceptar= new JButton();
        btnCancelar=new JButton();

        add(etiqNombre);
        add(textNombre);
        add(etiqApellido);
        add(textApellido);
        add(etiqDni);
        add(textDni);
        add(btnAceptar);
        add(btnCancelar);

        etiqNombre.setText("Nombre");
        etiqNombre.setSize(80,20);
        etiqNombre.setLocation(40,20);
        textNombre.setBounds(120,20,250,25);

        etiqApellido.setText("Apellido");
        etiqApellido.setSize(80,20);
        etiqApellido.setLocation(40,50);
        textApellido.setBounds(120,50,250,25);

        etiqDni.setText("DNI");
        etiqDni.setSize(80,20);
        etiqDni.setLocation(40,80);
        textDni.setBounds(120,80,100,25);

        btnAceptar.setSize(100, 30);
        btnAceptar.setText("Aceptar");
        btnAceptar.setLocation(90,130);

        btnAceptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ViewConfirmacion confirmacion= new ViewConfirmacion();
                confirmacion.setVisible(true);
                super.mouseClicked(e);
            }
        });

        btnCancelar.setSize(100, 30);
        btnCancelar.setText("Cancelar");
        btnCancelar.setLocation(230,130);



    }
}

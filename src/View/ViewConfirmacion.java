package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Model.ClientesCRUD;
import Model.ClientesDatos;
import View.ViewCrearCliente;

public class ViewConfirmacion extends JFrame {

    private JLabel etiqconf;
    private JButton btnAceptarConf;
    private JButton btnCancelarConf;

    public ViewConfirmacion(){
        setSize(400,200);
        setResizable(false);
        setVisible(true);
        setTitle("Confirmacion");
        setLayout(null);
        setLocationRelativeTo(null);

        etiqconf =new JLabel();
        btnAceptarConf=new JButton();
        btnCancelarConf=new JButton();

        add(etiqconf);
        add(btnAceptarConf);
        add(btnCancelarConf);

        etiqconf.setLocation(100,30);
        etiqconf.setSize(250,40);
        etiqconf.setText("Esta seguro que desea proseguir?...");


        btnAceptarConf.setLocation(100,100);
        btnAceptarConf.setSize(100,30);
        btnAceptarConf.setText("Aceptar");
        btnAceptarConf.addActionListener(new ActionListener() {
            //guardar los datos en el arraylist
            public void actionPerformed(ActionEvent e) {
                ClientesCRUD.getInstance().;
            }
        });

        btnCancelarConf.setLocation(200,100);
        btnCancelarConf.setSize(100,30);
        btnCancelarConf.setText("Cancelar");
        btnCancelarConf.addActionListener(new ActionListener() {
            //retornar pantalla anterior
            public void actionPerformed(ActionEvent e) {
               return;
            }
        });

    }
}

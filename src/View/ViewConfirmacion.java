package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewConfirmacion extends JFrame {
    private JLabel etiqconf;
    private JButton btnAceptarConf;
    private JButton btnCancelarConf;
    public ViewConfirmacion(){
        setSize(400,250);
        setLocationRelativeTo(null);
        setTitle("Confirmacion");

        etiqconf =new JLabel();
        btnAceptarConf=new JButton();
        btnCancelarConf=new JButton();
        add(etiqconf);
        add(btnAceptarConf);
        add(btnCancelarConf);

        etiqconf.setLocation(80,30);
        etiqconf.setSize(250,30);
        etiqconf.setText("Esta seguro que desea proseguir?...");

        btnAceptarConf.setLocation(80,150);
        btnAceptarConf.setSize(250,30);
        btnAceptarConf.setText("Aceptar");

        btnCancelarConf.setLocation(150,150);
        btnCancelarConf.setSize(250,30);
        btnCancelarConf.setText("Cancelar");
        btnCancelarConf.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                super.mouseClicked(e);
            }
        });

    }
}

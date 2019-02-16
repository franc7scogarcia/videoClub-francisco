package View;

import Controller.ControllerClientes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


    public class ViewPantallaPrincipal extends JFrame {
        private JMenuBar mnuVideoClub;
        private JButton nuevoClienteButton ;
        private JTable table1;
        private JMenu mnuCliente;
        private JMenu mnuPeliculas ;
        private JMenuItem mnuClienteNuevo;
        private JMenuItem mnuClienteBuscar;
        private JMenuItem mnuClienteEliminar;
        private JMenuItem mnuSalir;
        private JTextField txtBuscar;
        private JButton btnBuscar;

        public  ViewPantallaPrincipal(){
            setTitle("Video Club" );
            setLayout(null);
            setResizable(true);
            setSize(1600,700);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mnuVideoClub =new JMenuBar();
            nuevoClienteButton= new JButton();
            table1 =new JTable(100, 3);
            mnuPeliculas= new JMenu("Peliculas");
            mnuCliente=new JMenu("Clientes");
            mnuClienteBuscar=new JMenuItem("Buscar");
            mnuClienteNuevo =new JMenuItem("Nuevo Cliente");
            mnuClienteEliminar = new JMenuItem("Eliminar");
            mnuSalir = new JMenuItem("Salir");
            txtBuscar= new JTextField(20);
            btnBuscar= new JButton();

            mnuCliente.add(mnuClienteNuevo);
            mnuCliente.add(mnuClienteBuscar);
            mnuCliente.add(mnuClienteEliminar);
            mnuCliente.add(mnuSalir);
            mnuVideoClub.add(mnuCliente);

            setJMenuBar(mnuVideoClub);

            add(nuevoClienteButton);
            add(table1);
            add(txtBuscar);
            add(btnBuscar);

            nuevoClienteButton.setText("Nuevo Cliente");
            nuevoClienteButton.setSize( 200,30);
            nuevoClienteButton.setLocation(300, 10);
            table1.setSize(409,500);
            table1.setLocation(800, 42);
            //table1.setRowHeight(3);
            //table1.setAutoCreateColumnsFromModel(true);
            txtBuscar.setSize(359,30);
            txtBuscar.setLocation(800,10);
            btnBuscar.setSize(50,30);
            btnBuscar.setLocation(1159,10);
            btnBuscar.setText("ok");

            nuevoClienteButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ViewCrearCliente cliente= new ViewCrearCliente();
                    cliente.setVisible(true);
                    super.mouseClicked(e);

                }
            });
            //Cerrar la aplicacion
            mnuSalir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            //Metodo para llamar nuevo cliente
            mnuClienteNuevo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ViewCrearCliente nuevo= new ViewCrearCliente();
                    nuevo.setVisible(true);
                }
            });
         }
    }

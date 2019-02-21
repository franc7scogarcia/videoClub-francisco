package View;

import Controller.ControllerClientes;
import Model.ClientesDatos;

import javax.swing.*;
import javax.swing.event.InternalFrameListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;
import java.util.ListIterator;


public class ViewPantallaPrincipal extends JFrame {
        private JMenuBar mnuVideoClub;
        private JButton nuevoClienteButton ;
        private JTable table1;
        private DefaultTableModel mTabla;
        private JMenu mnuCliente;
        private JMenu mnuPeliculas ;
        private JMenuItem mnuClienteNuevo;
        private JMenuItem mnuClienteBuscar;
        private JMenuItem mnuClienteEliminar;
        private JMenuItem mnuSalir;
        private JTextField txtBuscar;
        private JButton btnBuscar;
        private JScrollPane scrTabla;
        private JRadioButton rbtnNombre;
        private JRadioButton rbtnApellido;
        private JRadioButton rbtnDNI;

        private ControllerClientes controlcli;
        public void setcontrol(ControllerClientes control){
            controlcli =control;
        }
        ControllerClientes control =new ControllerClientes();

        public  ViewPantallaPrincipal() {
            setTitle("Video Club");
            setLayout(null);
            setResizable(true);
            setSize(1600, 700);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mnuVideoClub = new JMenuBar();
            nuevoClienteButton = new JButton();
            table1 = new JTable();
            scrTabla = new JScrollPane();
            mnuPeliculas = new JMenu("Peliculas");
            mnuCliente = new JMenu("Clientes");
            mnuClienteBuscar = new JMenuItem("Buscar");
            mnuClienteNuevo = new JMenuItem("Nuevo Cliente");
            mnuClienteEliminar = new JMenuItem("Eliminar");
            mnuSalir = new JMenuItem("Salir");
            txtBuscar = new JTextField(20);
            btnBuscar = new JButton();
            rbtnNombre = new JRadioButton("Nombre");
            rbtnApellido = new JRadioButton("Apellido");
            rbtnDNI = new JRadioButton("DNI");

            mnuCliente.add(mnuClienteNuevo);
            mnuCliente.add(mnuClienteBuscar);
            mnuCliente.add(mnuClienteEliminar);
            mnuCliente.add(mnuSalir);
            mnuVideoClub.add(mnuCliente);

            setJMenuBar(mnuVideoClub);

            add(nuevoClienteButton);
            add(txtBuscar);
            add(btnBuscar);
            add(scrTabla);
            add(rbtnNombre);
            add(rbtnApellido);
            add(rbtnDNI);

            scrTabla.setViewportView(table1);
            nuevoClienteButton.setText("Nuevo Cliente");
            nuevoClienteButton.setSize(200, 30);
            nuevoClienteButton.setLocation(300, 10);
            scrTabla.setSize(409, 300);
            scrTabla.setLocation(800, 150);
            txtBuscar.setSize(359, 30);
            txtBuscar.setLocation(800, 10);
            txtBuscar.setToolTipText("Busqueda");
            btnBuscar.setSize(50, 30);
            btnBuscar.setLocation(1159, 10);
            btnBuscar.setText("ok");
            rbtnNombre.setBounds(800, 50, 70, 30);
            rbtnApellido.setBounds(970, 50, 70, 30);
            rbtnDNI.setBounds(1150, 50, 70, 30);

            //Llama a la ventana nuevo cliente
            nuevoClienteButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ViewCrearCliente cliente = new ViewCrearCliente();
                    cliente.setVisible(true);
                    super.mouseClicked(e);

                }
            });
            //Cerrar la aplicacion
            mnuSalir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            //Metodo para llamar nuevo cliente
            mnuClienteNuevo.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    ViewCrearCliente nuevo = new ViewCrearCliente();
                    nuevo.setVisible(true);
                }
            });
            //cargar la tabla
            cargarTabla(control);
         }
         public void cargarTabla(ControllerClientes control){
             String titulos[]={"Nombre","Apellido","DNI"};
             String arreglo[]=new String[3];
             mTabla= new DefaultTableModel(null,titulos);
             //mostrar lista de los clientes en la tabla

             int i;
             for(i=0;i<ControllerClientes.getInstance().mostrarLista().size();i++){
                 arreglo[0]= ControllerClientes.getInstance().mostrarLista().get(i).getNombre();
                 arreglo[1]=ControllerClientes.getInstance().mostrarLista().get(i).getApellido();
                 arreglo[2]=""+ControllerClientes.getInstance().mostrarLista().get(i).getDNI();
                 mTabla.addRow(arreglo);
             }
             table1.setModel(mTabla);
         }
}

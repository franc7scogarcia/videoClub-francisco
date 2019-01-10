/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Clientes.ClientesDatos;
import Controller.ControllerClientes; // Controlador - La vista lo único que ve es el controlador
import java.util.Scanner;
import java.util.List;
import Model.ClientesCRUD;

/**
 *
 * @author matias
 */
public class ViewPantallaCliente implements ILiterales  {   
    public static void MnuCliente(){
        
        int mnuOpcion = 0 ;
        
        System.out.println(mnuClienteOpcion1);
        System.out.println(mnuClienteOpcion2);
        System.out.println(mnuClienteOpcion3);
        System.out.println(mnuClienteOpcion4);
        System.out.println(mnuClienteOpcion5);
        System.out.println(mnuVolverMenuAnterior);
        System.out.println("");
        System.out.println(elegirOpcion);
       
        Scanner sc1 = new Scanner(System.in);
        mnuOpcion = sc1.nextInt();
        
        seleccionMenuCliente(mnuOpcion);                       
    }

    private static void seleccionMenuCliente(int mnuOpcion) {
         ControllerClientes control = ControllerClientes.getInstance();
        /**
         * vista menu cliente
         */
        if (mnuOpcion == 1) {
            ViewNuevoCliente(control);
        } else if (mnuOpcion == 2) {
            eliminarCliente();
        } else if (mnuOpcion == 3) {
            editarCliente();
        } else if (mnuOpcion == 4) {
            MenuClienteBuscar();
        } else if (mnuOpcion == 5) {
            ViewMostrarClientes(control);
        } else if (mnuOpcion == 9) {
            ViewPantallaPrincipal.MnuPrincipal();    
        } else {
            System.out.println("La opción ingresada no es correcta ...");           
            MnuCliente();
        }
    }    
    //Opciones del menu buscar clientes
    public static void MenuClienteBuscar() { 
        int mnuOpcionBuscar = 0 ;
        
        System.out.println(buscarOpcion1);
        System.out.println(buscarOpcion2);
        System.out.println(mnuVolverMenuAnterior);
        System.out.println("");
        System.out.println(elegirOpcion);
       
        Scanner sc1= new Scanner(System.in);
        mnuOpcionBuscar = sc1.nextInt();
        seleccionMenuClienteBuscar(mnuOpcionBuscar);       
    }    
    
    private static void seleccionMenuClienteBuscar(int mnuOpcionBuscar) {

        if (mnuOpcionBuscar == 1) {
            ViewBuscarClienteDNI();
        } else if (mnuOpcionBuscar == 2) {
            ViewBuscarClienteApellido();
        } else if (mnuOpcionBuscar == 9) {
            ViewPantallaCliente.MnuCliente();    
        } else {
            System.out.println("La opción ingresada no es correcta ....");           
            MenuClienteBuscar();
        }
    }    
    
    private static void ViewNuevoCliente(ControllerClientes control) {
        // Declaraciíon de variables 
        int DNI = 0;
        String apellido = "";
        String nombre = "";
        
        Scanner sc1 = new Scanner(System.in);
         
        System.out.println("DNI: ");
        DNI = sc1.nextInt();
        
        System.out.println("Apellido: ");
        apellido = sc1.next();
        
        System.out.println("Nombre: ");
        nombre = sc1.next(); 
        
        System.out.println(confirmacion);
        char aux = sc1.next().toUpperCase().charAt(0);
             
        if ('S' == aux ){            
            
            // Si negamos la consulta lo que sucede es que cuando vuelva con error se pida ingresar de nuevo todos los datos
            if (!control.SaveClientes(DNI, apellido, nombre)){
                ViewNuevoCliente(control);
            }
        }else {
            System.out.println("No se grabarán los datos");
        }     
        
        MnuCliente();            
    }
    
    private static void eliminarCliente() { 
       System.out.println("Eliminar Cliente: ");
       //Llamada al metodo para buscar el cliente a eliminar
       System.out.println(elegirOpcion);
       MenuClienteBuscar();
       
    }      
    private static void editarCliente() { 
       System.out.println("Editar Cliente");
       System.out.println(elegirOpcion);
       //llamada al metodo para editar cliente
       MenuClienteBuscar();
    }
    private static void ViewMostrarClientes(ControllerClientes control) {           
       //mostrar lista de los elementos
        int i;
        for(i=0;i<=ControllerClientes.getInstance().mostrarLista().size();i++){
            System.out.println(ControllerClientes.getInstance().mostrarLista().get(i).getApellido());
            System.out.println(ControllerClientes.getInstance().mostrarLista().get(i).getNombre());
            System.out.println(ControllerClientes.getInstance().mostrarLista().get(i).getDNI());
        }
        
    }
    private static void ViewBuscarClienteDNI(){
        
        int posicion; 
        Scanner sc1= new Scanner(System.in);
        System.out.println("Ingrese numero de DNI: ");
        int DNI= sc1.nextInt();
        posicion = ControllerClientes.getInstance().BuscarDatosClientes(DNI);
        // mostrar los datos del  cliente
        System.out.println("DNI: "+ClientesCRUD.getInstance().SearchClient().get(posicion).getDNI());
        System.out.println("Apellido: "+ClientesCRUD.getInstance().SearchClient().get(posicion).getApellido());
        System.out.println("Nombre: "+ClientesCRUD.getInstance().SearchClient().get(posicion).getNombre());
        //verificar si se elimina o no  
        System.out.println("Que operacion desea realizar");
        System.out.println("1.- Eliminar cliente");
        System.out.println("2.- Editar cliente");
        int op= sc1.nextInt();
        //Si se elimina llamar al método que elimina desde la pocisión
        if(op==1){
            ControllerClientes.getInstance().removeClientDatos(posicion);
        }else if (op== 2){
            ViewReadClient(posicion);
        }else{
            System.out.println("La opcion ingresada no es correcta");
            posicion=ControllerClientes.getInstance().BuscarDatosClientes(DNI);
        }
        //si no se elimina volver al menú de cliente
        MnuCliente();
    }
    private static void ViewBuscarClienteApellido(){
        Scanner sc1 = new Scanner(System.in);
        String apellido= sc1.next();
        ControllerClientes.getInstance().BuscarDatosClientes(apellido);
    }
    /**
     * metodo opciones editar cliente 
     * @param posicion 
     */
    private static void ViewReadClient(int posicion){
        System.out.println("Indicar el/os campos del cliente a modificar: ");
        System.out.println(opcion1);
        System.out.println(opcion2);
        System.out.println(opcion3);
        System.out.println(opcion4);
        Scanner  sc1 = new Scanner (System.in);
        int elopc = sc1.nextInt();
        
        if (elopc == '1'){
            ControllerClientes.getInstance().readClient(posicion);
        }else if (elopc =='2'){
            
            }else if (elopc == '3'){
        
             }else if (elopc =='4'){
               }else
                System.out.println("la opcion ingresada no es valida");
    }
    
}


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
            mostrarClientes(control);
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
        System.out.println(buscarOpcion3);
        System.out.println(mnuVolverMenuAnterior);
        System.out.println("");
        System.out.println(elegirOpcion);
       
        Scanner sc1= new Scanner(System.in);
        mnuOpcionBuscar = sc1.nextInt();
        seleccionMenuClienteBuscar(mnuOpcionBuscar);       
    }    
    
    private static void seleccionMenuClienteBuscar(int mnuOpcionBuscar) {

        if (mnuOpcionBuscar == 1) {
            buscarClienteDNI();
        } else if (mnuOpcionBuscar == 2) {
            buscarClienteApellido();
        } else if (mnuOpcionBuscar == 3) {
            buscarClienteApellidoNombre();
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
/*    public static void mostrarClientes(ControllerClientes control) {           
        List<ClientesDatos> almacenCliente = control.BuscarDatosClientes();
        
        int i=0;
        for(i=0;i<=almacenCliente.size();i++){
            System.out.println("" +almacenCliente.get(i));
        }
        
    }*/
    public static void buscarClienteDNI(){
        int dni=0;
        Scanner sc1 = new Scanner (System.in);
        System.out.println("ingrese el numero de DNI: ");
        dni= sc1.nextInt();
      
    }
    public static void buscarClienteApellido(){
        
    }
    public static void  buscarClienteApellidoNombre(){
        
    }

   /* public static buscarCliente(ControllerClientes nuevoCliente) {
        //buscar cliente dentro de la lista
        //System.out.println("Desea buscar clientes:");
        /*
         DNI
         APELLIDO Y/O NOMBR   */ 
        
        
  
   /* public int buscarCliente(ClientesDatos cliente , List<ClientesDatos> listaCliente, int Dni) {
        for(int i=0;i<listaCliente.size();i++ ){
            if(Dni == cliente.getDni()){
                listaCliente.lastIndexOf(i);
            }   
        } 
    return listaCliente.lastIndexOf(Dni);
    }
*/
}


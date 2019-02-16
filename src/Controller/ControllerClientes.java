/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
// importamos los paquetes del modelo
import Model.ClientesCRUD;
import Model.ClientesDatos;

import java.util.InputMismatchException;
import java.util.List;

import javax.swing.*;

public class ControllerClientes {
    private static ControllerClientes instance;
    //Crear constructor si es necesario instanciar el objeto
   /**
    * singleton
    */
   public ControllerClientes(){
        
    }
    public static ControllerClientes getInstance(){
        if (instance == null){
            instance = new ControllerClientes();
        }
        else{
            //System.out.println(" ya existe");
        }
    return instance;
    }
    
    public boolean SaveClientes(int DNI, String apellido, String nombre){
              
        boolean isSaved;
        
        try {           
            // llamar a un metodo del modelo que nos genere el objeto Cliente
            ClientesDatos nuevoCliente = new ClientesDatos(DNI,apellido, nombre);
            
            // llamar a otro método del modelo que nos guarde en una lista de clientes
            ClientesCRUD listaDeClientes = ClientesCRUD.getInstance();
            isSaved = listaDeClientes.AddClientes(nuevoCliente);
            
        } catch (InputMismatchException e ){
            System.out.println("Hubo un error con los datos del dni del cliente");    
            isSaved = false;
        }
        
        return isSaved;
        
    }
    
    public int BuscarDatosClientes(int DNI) {
       int position= ClientesCRUD.getInstance().SearchClient(DNI); 
       return position;
    }
      
    public List<ClientesDatos> BuscarDatosClientes(String apellido) {
       ClientesCRUD.getInstance().SearchClient(apellido);
        return  ClientesCRUD.getInstance().SearchClient(apellido) ;
    } 
    public List<ClientesDatos> mostrarLista(){
        ClientesCRUD.getInstance().SearchClient();
        return ClientesCRUD.getInstance().SearchClient();
    }
    /*
    revisar si esta bien el metodo
    */
    public List<ClientesDatos> removeClientDatos(int posicion){
        ClientesCRUD.getInstance().removeClient(posicion);
        return null;
    }
    /*
    Metodo modificar datos del cliente 
    */
    public List<ClientesDatos> modifClient(int posicion){
        
        return null;       
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;
import Clientes.ClientesDatos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author matias
 */
public class CRUDCliente implements ClienteCRUD{

 
    

    
    
    public ClientesDatos buscarCliente(List<ClientesDatos> listaCliente, ClientesDatos cliente) {
        //buscar cliente dentro de la lista
        //System.out.println("Desea buscar clientes:");
        /*
         DNI
         APELLIDO Y/O NOMBR    
        */
        
             
        if (cliente.getDni() > 0  && cliente.getApellido().isEmpty() && cliente.getNombre().isEmpty()) {
            // llamar al metodo que busca por dni
            //buscarCliente(ClientesDatos cliente, listaCliente, int a);
            
        } else if (true) {   // búsqueda por Apellido solo
         
        } else if (true) { // busqueda solo por nombre
            
        } else if (true) { //búqueda por apellido y nombre
            
        } else { // mensaje de error 
         
        }
        return null;
        
    }
    
    /**
     *
     * @param listaCliente
     * @param cliente
     * @return
     */
    public int buscarCliente(ClientesDatos cliente , List<ClientesDatos> listaCliente, int Dni) {
        for(int i=0;i<listaCliente.size();i++ ){
            if(Dni == cliente.getDni()){
                listaCliente.lastIndexOf(i);
            }   
        } 
    return listaCliente.lastIndexOf(Dni);
    }


    @Override
    public ClientesDatos mostrarCliente(ClientesDatos cliente) {
                //mostrar lista
        List<ClientesDatos> lista = null;
        System.out.println("Listado de Clientes");
        lista.forEach((cli) -> {
            System.out.println("Id Socio: "+ cli.getIdsocio());
            System.out.println("Nombre: " + cli.getNombre());
            System.out.println("Apellido: "+ cli.getApellido());
            System.out.println("Domicilio: "+ cli.getDomicilio());
            System.out.println("Localidad: "+ cli.getLocalidad());
            System.out.println("Telefono: "+ cli.getTelefono());
            System.out.println("Fecha de Nacimiento: "+ cli.getFNacimiento());
            System.out.println("DNI: "+ cli.getDni());
            System.out.println("Edad: "+ cli.getEdad());
           
        });

        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClientesDatos editarCliente(ClientesDatos cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public ClientesDatos eliminarCliente(ClientesDatos cliente ,int nsoc) {
        //eliminar cliente de la lista
        List<ClientesDatos> lista = null;
        int nroSoc=0;
        boolean cond = false;
        do{ 
            Scanner sc1 = new Scanner (System.in);
            char conf, rem;
            System.out.println("Quiere eliminar este cliente: ");
            rem = sc1.next().toUpperCase().charAt(0);
            if(rem =='S'){
                System.out.println("confirmar (S/N)");
                conf= sc1.next().toUpperCase().charAt(0);
                
                if (conf =='S')
                nroSoc=nsoc-1;
                lista.lastIndexOf(rem);
                lista.remove(nroSoc);            
            }
           
            
            
            System.out.println("Desea eliminar otro cliente (S/N): ");
            rem = sc1.next().toUpperCase().charAt(0);
            conf=rem;
            if(conf=='N'){
                cond = false;
            }
        }while(cond == true);
        

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public ClientesDatos eliminarCliente(ClientesDatos cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

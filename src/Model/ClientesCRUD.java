/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MATIAS
 */
public class ClientesCRUD { //con singleton
    
    private List<ClientesDatos> almacenCliente; 
    
    public ClientesCRUD(){
        this.almacenCliente = new ArrayList();;
    }
    
    public boolean AddClientes(ClientesDatos nuevoCliente) {
        this.almacenCliente.add(nuevoCliente);
        return true;
    }
    
    public List<ClientesDatos> SearchClient(){
        return this.almacenCliente;
    }
    
    public int SearchClient(int DNI){
        int i=0;
        int result = -1;
        for(i=0;i<=this.almacenCliente.size();i++){
            if (this.almacenCliente.get(i).getDNI() == DNI){               
                result = this.almacenCliente.indexOf(this.almacenCliente.get(i));                
            }           
        }        
        return result; 
    }
    
    public List<ClientesDatos> SearchClient(String apellido){        
        List<ClientesDatos> listaClientes = new ArrayList(); 
        int i=0;        
        
        for(i=0;i<=this.almacenCliente.size();i++){            
            ; 
            
            if (this.almacenCliente.get(i).getApellido() == apellido){                
               listaClientes.add(this.almacenCliente.get(i));
            }           
        }        
        return listaClientes; 
    }
    
    
}

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
public class ClientesCRUD {
    
    private List<ClientesDatos> almacenCliente; 
    
    public ClientesCRUD(){
        this.almacenCliente = new ArrayList();;
    }
    
    public boolean AddClientes(ClientesDatos nuevoCliente) {
        this.almacenCliente.add(nuevoCliente);
        return true;
    }
    
    
    
}

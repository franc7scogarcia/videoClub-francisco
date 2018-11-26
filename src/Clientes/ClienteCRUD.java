/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

/**
 *
 * @author MATIAS
 */
public interface ClienteCRUD {
    
    public ClientesDatos crearCliente();
    
    // Refactorizar en cuanto tengamos definido como almacenar los clientes
    public ClientesDatos buscarCliente(ClientesDatos cliente);
    
    public ClientesDatos mostrarCliente(ClientesDatos cliente);
    
    public ClientesDatos editarCliente(ClientesDatos cliente);
        public ClientesDatos eliminarCliente(ClientesDatos cliente);
    
    
}

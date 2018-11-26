/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Clientes.ClientesDatos;
import java.util.List;

/**
 *
 * @author MATIAS
 */
public interface ClientesPersistencia {
    
    public List<ClientesDatos> saveCliente(ClientesDatos cliente);
    
}

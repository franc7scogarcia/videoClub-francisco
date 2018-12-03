/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MATIAS
 */
public interface IDatosClientes {
    
    /**
     *
     * @return
     */
    public int getDNI();

    public String getNombre();

    public String getApellido();
       
    public int setDNI(int idSocio);

    public String setNombre(String nombre);
    
    public String Apellido(String apellido);
    
    
}

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
public interface DatosClientes {
    
    /**
     *
     * @return
     */
    public int getIdsocio();
    public int setIdsocio(int idSocio);

    public String getNombre();
    public String setNombre(String nombre);

    public String getApellido();
    public String setApellido(String apellido);
    
    public String getDomicilio();
    public String setDomicilio(String domicilio);

    public String getLocalidad();
    public String setLocalidad(String localidad);

    public String getTelefono(); 
    public String setTelefono(String telefono);
   
    public String getFNacimiento();
    public String setFNacimiento(String fNacimiento);
    
    public double getDni();
    public double setDni(double dni);
    
    public int getEdad ();
    public int setEdad(int edad);
    
    
    
    
    
}

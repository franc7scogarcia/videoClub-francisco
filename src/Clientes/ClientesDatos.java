



package Clientes;


public class ClientesDatos implements DatosClientes{
    //atributos
    private int idSocio;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String localidad;
    private String telefono;
    private String fNacimiento;
    private double dni;
    private int edad;
    
    public ClientesDatos()
    {
        
    }
    
    //constructor

    public ClientesDatos(int idSocio, String nombre, String apellido, String domicilio, String localidad,  String telefono , String fNacimiento , double dni , int edad ) {
        
        this.idSocio = 0;
        this.nombre = "";
        this.apellido ="";
        this.domicilio ="";
        this.localidad = "";
        this.telefono = "";
      /*
      this.idSocio = idSocio;
      this.nombre = nombre;
      this.apellido = apellido;
      this.domicilio = domicilio;
      this.localidad = localidad; 
      this.telefono = telefono;
      this.fNacimiento=fNacimiento;
      this.dni=dni;
      this.edad=edad;
      */
    }

    public int getIdsocio() {
        return idSocio;
    }
    
    public int setIdsocio(int idSocio) {
       return this.idSocio = idSocio;
    }
     
    public String getNombre() {
        return nombre;
    }
    
    public String setNombre(String nombre) {
       return this.nombre = nombre;
    }    

    public String getApellido() {
        return apellido;
    }
    
    public String setApellido(String apellido) {
       return this.apellido = apellido;
    }
     
    public String getDomicilio() {
        return domicilio;
    }

    public String setDomicilio(String domicilio) {
       return this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }
    
    public String setLocalidad(String localidad) {
        return this.localidad = localidad;
    }    
    
    public String getTelefono() {
        return telefono;
    }
    
    public String  setTelefono(String telefono) {
       return this.telefono = telefono;
    }  
      
     public String getFNacimiento() {
        return fNacimiento;
    }
     
    public String setFNacimiento(String fNacimiento) {
        return this.fNacimiento = fNacimiento;
    }
    
    public double getDni() {
        return dni;
    }

    public double setDni(double dni) {
        return this.dni = dni;
    }
    
    public int getEdad() {
        return edad;
    }

    public int setEdad(int edad) {
        return this.edad = edad;
    }
    
}


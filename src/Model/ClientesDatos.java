package Model;


public class ClientesDatos implements IDatosClientes{
    private int DNI;
    private String nombre;
    private String apellido;
    
    
    //constructores
    // aplicaremos polimorfismos y creamos dos constructores uno con parámetros y otro sin parámetros.
    // Su uso dependerá de la situación 

    public ClientesDatos(int DNI, String nombre, String apellido) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
    }
   
    public ClientesDatos() {
        this.DNI = 0;
        this.nombre = "";
        this.apellido ="";
    }
     
    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int setDNI(int DNI) {
       return this.DNI = DNI;
    }

    public String setNombre(String nombre) {
       return this.nombre = nombre;
    }

    public String Apellido(String apellido) {
       return this.apellido = apellido;
    }
    
}


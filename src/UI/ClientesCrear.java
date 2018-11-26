
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Clientes.ClientesDatos;
import static View.ILiterales.confirmacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author matias
 */
public class ClientesCrear {
     public static List<ClientesDatos> crearCliente() {
         int i=0, c=0, nsoc, soc=0;
        boolean cond = true;
        char confirmar, rem;
       
        Scanner sc1 = new Scanner(System.in);
        
        //crear lista
        List<ClientesDatos> lista;
        lista = new ArrayList<>();
        System.out.println("Nuevo Cliente: ");    
        do {
            //objeto cliente
            ClientesDatos cliente;
             cliente = new ClientesDatos();
             
            System.out.println("Ingrese dni: ");
            cliente.setDni(sc1.nextInt());
        
            System.out.println("ingrese apellido: ");
            cliente.setApellido(sc1.next());
        
       /*   
            System.out.println("Ingrese el nombre: ");
            cliente.setNombre(sc1.next());
            
            System.out.println("Ingrese fecha de nacimiento: ");
            cliente.setFNacimiento(sc1.next());

            System.out.println("Ingrese edad: ");
            cliente.setEdad(sc1.nextInt());
            
            System.out.println("ingrese localidad: ");
            cliente.setLocalidad(sc1.next());
        
            System.out.println("Ingrese el domicilio: ");
            cliente.setDomicilio(sc1.next());
                   
            System.out.println("Ingrese telefono: ");
            cliente.setTelefono(sc1.next());
            
            cliente.setIdsocio (c+1);
            System.out.print("Numero de socio: "+cliente.getIdsocio());
            */
            System.out.println(confirmacion);
            char aux = sc1.next().toUpperCase().charAt(0);
        
            if ('S' == aux ){
                System.out.println("Datos almacenados");
                lista.add(cliente);
            } else {
                System.out.println("No se grabarán los datos");
            }

            System.out.println("¿Desea ingresar otro cliente? (S/N) ");
            confirmar = sc1.next().toUpperCase().charAt(0);
            
            if (confirmar == 'N'){
                cond = false;
            }
            c=c+1;                              
        } while (cond == true);
        int size= lista.size();
        
        return lista;
    }
    
}
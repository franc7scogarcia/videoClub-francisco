/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.util.Scanner;
import UI.ClientesCrear;

/**
 *
 * @author matias
 */
public class ViewPantallaCliente implements ILiterales  {
    
    public static void MnuCliente(){
        
        int mnuOpcion = 0 ;
        
        System.out.println(mnuClienteOpcion1);
        System.out.println(mnuClienteOpcion2);
        System.out.println(mnuClienteOpcion3);
        System.out.println(mnuClienteOpcion4);
        System.out.println(mnuClienteOpcion5);
        System.out.println(mnuVolverMenuAnterior);
        System.out.println("");
        System.out.println(elegirOpcion);
       
        Scanner sc1 = new Scanner(System.in);
        mnuOpcion = sc1.nextInt();
        
        seleccionMenuCliente(mnuOpcion);
                       
    }

    private static void seleccionMenuCliente(int mnuOpcion) {

        if (mnuOpcion == 1) {
            ViewNuevoCliente();
        } else if (mnuOpcion == 2) {
            
        } else if (mnuOpcion == 3) {
            
        } else if (mnuOpcion == 4) {
            
        } else if (mnuOpcion == 5) {
            
        } else if (mnuOpcion == 9) {
            ViewPantallaPrincipal.MnuPrincipal();    
        } else {
            System.out.println("La opción ingresada no es correcta ...");
            System.out.println("Intentelo nuevamente");
            MnuCliente();
        }
        MnuCliente();
    }    
    
    private static void ViewNuevoCliente() {
       ClientesCrear.crearCliente();
        // Declaraciíon de variables 
       /* int DNI = 0;
        String apellido = "";
        String nombre = "";
        
        Scanner sc1 = new Scanner(System.in);
         
        
        System.out.println("DNI: ");
        DNI = sc1.nextInt();
        
        System.out.println("Apellido: ");
        apellido = sc1.next();
        
        System.out.println("Nombre: ");
        nombre = sc1.next(); 
        
        System.out.println(confirmacion);
        char aux = sc1.next().toUpperCase().charAt(0);
        
        if ('S' == aux ){
            System.out.println("Datos almacenados");
        } else {
            System.out.println("No se grabarán los datos");
        }*/
 
    }
}


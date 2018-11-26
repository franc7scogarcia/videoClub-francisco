/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public final class ViewPantallaPrincipal implements ILiterales {
    
    public static void MnuPrincipal(){
        
        int mnuOpcion = 0 ;
        
        System.out.println(mnuPrincipalOpcion1);
        System.out.println(mnuPrincipalOpcion2);
        System.out.println(mnuPrincipalOpcion3);
        System.out.println(mnuPrincipalOpcion4);
        System.out.println(mnuPrincipalOpcion5);
        System.out.println(mnuPrincipalOpcion6);
        System.out.println("");
        System.out.println(elegirOpcion);
       
        Scanner sc1 = new Scanner(System.in);
        mnuOpcion = sc1.nextInt();
        
        seleccionMenuPrincipal(mnuOpcion);
                       
    }

    private static void seleccionMenuPrincipal(int mnuOpcion) {

        if (mnuOpcion == 1) {
            ViewPantallaCliente.MnuCliente();
        } else if (mnuOpcion == 2) {
            // to do 
        } else if (mnuOpcion == 3) {
            // to do 
        } else if (mnuOpcion == 4) {
            // to do 
        } else if (mnuOpcion == 5) {
            // to do 
        } else if (mnuOpcion == 6) {
            // to do 
        } else {
            System.out.println("La opción ingresada no es correcta ...");
            System.out.println("Intentelo nuevamente.");
            //wait
            MnuPrincipal();            
        }

    }
    
}

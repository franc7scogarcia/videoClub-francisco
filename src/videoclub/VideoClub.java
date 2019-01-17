/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

/**
 *
 * @author matias
 */
import View.ViewPantallaPrincipal;
import View.ViewJFramePrincipal;
import javax.swing.JFrame;
import videoclub.VideoClub;



public class VideoClub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ViewPantallaPrincipal.MnuPrincipal();
         JFrame pantalla = new ViewJFramePrincipal();
         pantalla.setVisible(true);         
        
    }
    
}

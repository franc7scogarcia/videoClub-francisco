 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

 import Controller.ControllerClientes;
 import View.ViewPantallaPrincipal;

 import javax.swing.*;
 import java.awt.*;

 public class VideoClub {

     public VideoClub() {
     }

    public static void main(String[] args) {
         ControllerClientes controlCli =new ControllerClientes();
        ViewPantallaPrincipal frame = new ViewPantallaPrincipal();
      //  frame.setcontrol(controlCli);
        frame.setVisible(true);

    }
    
}

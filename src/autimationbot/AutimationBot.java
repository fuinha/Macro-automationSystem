/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autimationbot;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;
/**
 *
 * @author alexa
 */



public class AutimationBot {

   
        


    
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
      
     
    }
    
public void keyPressed(KeyEvent e){
    int keyCode = e.getKeyCode();
    if(keyCode == KeyEvent.VK_G){
        System.out.println("wow");
    }else{
        e.consume();
    }
}
    
}




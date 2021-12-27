
package promanager;

import javax.swing.JFrame;

public class ProManager {


    public static void main(String[] args) {
       JFrame application = new JFrame ("User inputs");
    
        GUI graphicalInterface = new GUI();  
        application.add(graphicalInterface);   

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        application.setSize(6000,6000);           
        application.pack();
        application.setVisible(true); 
        application.setResizable(false);
    }
}

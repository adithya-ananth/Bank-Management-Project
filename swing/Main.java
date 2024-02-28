

 
 
 
  
 import java.awt.*;
 
 import javax.swing.*;

  
 public class Main {
     public static void addComponentsToPane(Container pane) {
         pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
  
         addAButton("Login as Admin", pane);
         addAButton("Login as User", pane);
         addAButton("Sign Up", pane);
         
     }
  
     private static void addAButton(String text, Container container) {
         JButton button = new JButton(text);
         JPanel buttonsPanel1 = new JPanel();
         button.setSize(100,80);
         button.setAlignmentX(Component.CENTER_ALIGNMENT);
         buttonsPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
         container.add(button);
     }
  
     /**
      * Create the GUI and show it.  For thread safety,
      * this method should be invoked from the
      * event-dispatching thread.
      */
     private static void createAndShowGUI() {
         //Create and set up the window.
         JFrame frame = new JFrame("IIT Tirupati Bank");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
         //Set up the content pane.
         addComponentsToPane(frame.getContentPane());
  
         //Display the window.
         frame.pack();
        
         frame.setVisible(true);
     }
  
     public static void main(String[] args) {
         //Schedule a job for the event-dispatching thread:
         //creating and showing this application's GUI.
         javax.swing.SwingUtilities.invokeLater(new Runnable() {
             public void run() {
                 createAndShowGUI();
             }
         });
     }
 }
 
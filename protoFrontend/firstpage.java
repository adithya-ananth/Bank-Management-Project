import java.util.*;
import java.awt.event.*;
import javax.swing.*;

class firstpage{
    public static void main(String[] args){
        JFrame f = new JFrame("IIT Bank");
        
        
     
        JButton b = new JButton("Login as User");
        b.setBounds(850,100,200,100);
        JButton c = new JButton("Login as Admin");
        c.setBounds(850,220,200,100);
        JButton d = new JButton("Sign Up");
        d.setBounds(850,340,200,100);
         

        f.add(b);f.add(c);f.add(d);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
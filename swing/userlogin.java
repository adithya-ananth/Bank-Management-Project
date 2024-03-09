import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class userlogin{
    public static void main(String[] args){
        JFrame f =  new JFrame("IIT BANK");

        JLabel l1; l1 = new JLabel("LOGIN HERE");
        l1.setFont(new Font("Arial", Font.PLAIN, 50));
        l1.setBounds(850,0,400,200);
        f.add(l1);

        JLabel l2; l2 = new JLabel("Username : ");
        l2.setFont(new Font("Arial", Font.PLAIN, 30));
        l2.setBounds(700,200,300,50);
        f.add(l2);

        final JTextField tf1 = new JTextField();
        tf1.setBounds(900,200,100,50);


        JLabel l3; l3 = new JLabel("Password : ");
        l3.setFont(new Font("Arial", Font.PLAIN, 30));
        l3.setBounds(700,350,300,50);
        f.add(l3);

        JPasswordField value = new JPasswordField();
        value.setBounds(900,350,100,50);    
        f.add(value);

        f.add(tf1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
// implement optionpane 
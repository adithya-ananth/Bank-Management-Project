import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class homepageuser{
    public static void main(String[] args){
        JFrame f = new JFrame("IIT BANK");
        JLabel l = new JLabel("WELCOME TO IIT BANK");
        l.setFont(new Font("Impact", Font.PLAIN, 50));
        l.setBounds(700,0,1000,50);
        f.add(l);

        JLabel l1 = new JLabel("Hi "); //  need to map the name to the username and put that here
        l1.setFont(new Font("Impact", Font.PLAIN, 40));
        l1.setBounds(600,100,1000,50);
        f.add(l1);

        JButton b1 = new JButton("Acc Details");
        b1.setBounds(700,200,300,40);
        f.add(b1);

        JButton b = new JButton("LogOut");
        b.setBounds(1800,20,100,20);
        f.add(b);

        JButton b2 = new JButton("CheckBalance");
        b2.setBounds(700,300,300,40);
        f.add(b2);

        JButton b3 = new JButton("Transfer");
        b3.setBounds(700,400,300,40);
        f.add(b3);

        JButton b4 = new JButton("Loan Apply");
        b4.setBounds(700,500,300,40); 
        f.add(b4);

        JButton b5 = new JButton("Trans History");
        b5.setBounds(700,600,300,40);
        f.add(b5);

        JLabel tf = new JLabel("Want to SAVE money?");
        tf.setBounds(600,700,400,30);
        f.add(tf);

        JButton b6 = new JButton("SAVINGS");
        b6.setBounds(800,700,300,40);
        f.add(b6);



        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}

// implement optionpane 
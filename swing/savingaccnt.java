import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class savingaccnt{
    public static void main(String[] args){
        JFrame f = new JFrame("IIT BANK");
        
        

        JLabel l1 = new JLabel("  SAVINGS ACCOUNT "); //  need to map the name to the username and put that here
        l1.setFont(new Font("Impact", Font.PLAIN, 40));
        l1.setBounds(700,100,1000,50);
        f.add(l1);

        JButton b1 = new JButton("Acc Details");
        b1.setBounds(750,200,300,40);
        f.add(b1);

        JButton b = new JButton("LogOut");
        b.setBounds(1800,20,100,20);
        f.add(b);

        JButton b2 = new JButton("CheckBalance");
        b2.setBounds(750,300,300,40);
        f.add(b2);

        JButton b3 = new JButton("Deposit");
        b3.setBounds(750,400,300,40);
        f.add(b3);

        



        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}

// implement optionpane 
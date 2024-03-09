import java.util.*;
import java.awt.*;
import javax.swing.*;

class signup{
    public static void main(String[] args){
        JFrame f = new JFrame("IIT BANK");
        JLabel l; l = new JLabel("SIGN-UP HERE");
        l.setFont(new Font("Arial", Font.PLAIN, 50));
        l.setBounds(800,0,1000,100);
        f.add(l);

        JLabel l1 = new JLabel("Name");
        l1.setFont(new Font("Arial", Font.PLAIN, 30));
        l1.setBounds(700,100,1000,100);
        f.add(l1);

        JTextField tf1 = new JTextField();
        tf1.setBounds(800,125,100,50);
        f.add(tf1);

        JLabel l2 = new JLabel("PhoneNo");
        l2.setFont(new Font("Arial", Font.PLAIN, 30));
        l2.setBounds(700,175,1000,100);
        f.add(l2);

        JTextField tf2 = new JTextField();
        tf2.setBounds(850,200,100,50);
        f.add(tf2);

        JLabel l3 = new JLabel("Email");
        l3.setFont(new Font("Arial", Font.PLAIN, 30));
        l3.setBounds(700,250,1000,100);
        f.add(l3);

        JTextField tf3 = new JTextField();
        tf3.setBounds(850,275,100,50);
        f.add(tf3);

        JLabel l4 = new JLabel("Create UName");
        l4.setFont(new Font("Arial", Font.PLAIN, 30));
        l4.setBounds(700,325,1000,100);
        f.add(l4);

        JTextField tf4 = new JTextField();
        tf4.setBounds(950,350,100,50);
        f.add(tf4);

        JLabel l5 = new JLabel("Create Pwd");
        l5.setFont(new Font("Arial", Font.PLAIN, 30));
        l5.setBounds(700,400,1000,100);
        f.add(l5);

        JPasswordField value = new JPasswordField();
        value.setBounds(950,425,200,50);    
        f.add(value);

        JLabel l6 = new JLabel("Acc Type");
        l6.setFont(new Font("Arial", Font.PLAIN, 30));
        l6.setBounds(700,475,1000,100);
        f.add(l6);

        String s[] ={"SAVINGS","CURRENT"};
        JComboBox cb = new JComboBox(s);
        cb.setBounds(950,500,150,40);
        f.add(cb);

        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
    }
}
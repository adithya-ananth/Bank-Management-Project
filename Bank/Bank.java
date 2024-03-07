package Bank;

import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.isAdmin("cs23b069", "Spongebob@123");
        
        // System.out.println(admin.phone_num);
        // System.out.println(admin.email);
        // System.out.println(admin.username);
        // System.out.println(admin.password);

        admin.viewUsers();
    }
}

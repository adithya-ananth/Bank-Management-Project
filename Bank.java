package Bank;

import java.util.*;

public class Bank {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Admin admin = new Admin();
        
        // System.out.println(admin.phone_num);
        // System.out.println(admin.email);
        // System.out.println(admin.username);
        // System.out.println(admin.password);

        ArrayList<User> users_list = new ArrayList<User>();
        ArrayList<String> user_logs = new ArrayList<String>();

        admin.viewUsers(users_list);
    }
}
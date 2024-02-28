package Bank;

import java.util.*;

class Admin {
    final long phone_num = 9876543210L;
    final String email = "cs23b001@iittp.ac.in";
    final String username = "cs23b001";
    final String password = "Spongebob@123";

    public void viewLogs() {
        
    } 

    public void viewUsers(ArrayList<User> accounts_list) {
        for (int i = 0; i < accounts_list.size(); i++)
            System.out.printf("User %d:\nUser ID: %s\nFirst Name: %s\nLast Name: %s\nEmail: %s\n\n", i+1, accounts_list.get(i).user_id, accounts_list.get(i).fname, accounts_list.get(i).lname, accounts_list.get(i).email);
    }
}

public class Admin_Account {

}

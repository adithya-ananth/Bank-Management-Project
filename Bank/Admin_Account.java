package Bank;

import java.util.*;

@SuppressWarnings("unused")

class Admin {
    private final long phone_num = 9876543210L;
    private final String email = "cs23b069@iittp.ac.in";
    private final String username = "cs23b069";
    private final String password = "Spongebob@123";

    // we need to find out why these arraylists must be decalred as 'static'
    public static ArrayList<User> users_list = new ArrayList<User>();
    public static ArrayList<String> overall_logs = new ArrayList<String>();

    // need to link the Transaction DB 
    public void viewLogs() {
        for (int i = 0; i < overall_logs.size(); i++)
            System.out.println(overall_logs.get(i));
    }

    public void viewUsers() {
        for (int i = 0; i < users_list.size(); i++)
            System.out.printf("User %d:\nUser ID: %s\nFirst Name: %s\nLast Name: %s\nEmail: %s\n\n", i+1, users_list.get(i).user_id, users_list.get(i).fname, users_list.get(i).lname, users_list.get(i).email);
    }

    public boolean isAdmin(String username, String password) {
        if (!this.username.equals(username)) {
            System.out.println("Incorrect username");
            return false;
        }
        else if (!this.password.equals(password)) {
            System.out.println("Incorrect password");
            return false;
        }

        return true;
    }
}

public class Admin_Account {

}

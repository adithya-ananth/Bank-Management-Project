package Bank;

import java.util.*;

@SuppressWarnings("unused")

class Admin {
    private final long phoneNum = 9876543210L;
    private final String email = "cs23b069@iittp.ac.in";
    private final String username = "cs23b069";
    private final String password = "Spongebob@123";

    // we need to find out why these arraylists must be decalred as 'static'
    public static ArrayList<User> usersList = new ArrayList<User>();
    public static ArrayList<String> overallLogs = new ArrayList<String>();

    // need to link the Transaction DB 
    public void viewLogs() {
        for (int i = 0; i < overallLogs.size(); i++)
            System.out.println(overallLogs.get(i));
    }

    public void viewUsers() {
        for (int i = 0; i < usersList.size(); i++)
            System.out.printf("User %d:\nUser ID: %s\nFirst Name: %s\nLast Name: %s\nEmail: %s\n\n", i+1, usersList.get(i).userId, usersList.get(i).fname, usersList.get(i).lname, usersList.get(i).email);
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

package Bank;

import java.text.SimpleDateFormat;  
import java.util.*;

class Account {
    long amount = 0;

    public long getBalance() {
        return amount;
    }
}

class User extends Account {
    String user_id; // given to user (must have random numbers in it)
    // DOB will be added later (probably)
    String fname;
    String lname;
    String email;
    String phone_num;
    int login_PIN;

    String account_type = "current";
    ArrayList<String> user_logs = new ArrayList<String>();

    // constructor
    User (String user_id, String fname, String lname, String email, String phone_num, int login_PIN) {
        this.user_id = user_id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone_num = phone_num;
        this.login_PIN = login_PIN;

        // create temporary object to add to users_list
        User temp_user = new User(this.user_id, this.fname = fname, this.lname, this.email, this.phone_num, this.login_PIN);
        Admin.users_list.add(temp_user);
    }

    public boolean login(int login_PIN) {
        if (this.login_PIN == login_PIN)
            return true;

        return false;
    } 

    public void getDetails() {
        // Print above details (don't print account balance)
    }

    // the function transfers amount form user1 to user2
    public void transfer_money(User user1, User user2, long money) {
        user1.amount -= money;
        user2.amount += money;

        // get current date and time
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  

        String log = "User " + user1.user_id + " transferred $" + money + " to " + user2.user_id + " | " + formatter.format(date);
        user_logs.add(log);
        Admin.overall_logs.add(log);
    }
    
    public void viewHistory() {
        for (int i = 0; i < user_logs.size(); i++)
            System.out.println(user_logs.get(i));
    }
}

class Savings_Account extends User {
    @SuppressWarnings("unused")
    Savings_Account(String user_id, String fname, String lname, String email, String phone_num, int login_PIN) {
        super(user_id, fname, lname, email, phone_num, login_PIN);
        account_type = "savings";

        //  we'll decide whether we want to maintain a particular interest rate or if we wanna give an option to the user to change it
        double interest_rate = 5;

        // We have to add a function to add interest to the amount after a particular time period
    }
}

public class Bank_Account {

}

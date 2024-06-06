package Bank;

import java.text.SimpleDateFormat;  
import java.util.*;

class Account {
    protected long amount = 0;

    public long getBalance() {
        return amount;
    }
}

class User extends Account {
    // given to user (must have random numbers in it)
    protected String userId; 
    protected String fname;
    protected String lname;
    protected String email;
    protected String phoneNum;
    protected int loginPIN;

    String accountType = "current";
    ArrayList<String> userLogs = new ArrayList<String>();

    // default constructor
    User() {}

    // constructor with data elements
    User (String userId, String fname, String lname, String email, String phoneNum, int loginPIN, long amount) {
        super();

        this.userId = userId;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phoneNum = phoneNum;
        this.loginPIN = loginPIN;
        this.amount = amount;

        // create temporary object to add to users_list
        User tempUser = new User();
        tempUser.userId = this.userId;
        tempUser.fname = this.fname;
        tempUser.lname = this.lname;
        tempUser.email = this.email;
        tempUser.phoneNum = this.phoneNum;
        tempUser.loginPIN = this.loginPIN;
        tempUser.amount = this.amount;
        Admin.usersList.add(tempUser);
    }

    // login as user
    public boolean login(int loginPIN) {
        if (this.loginPIN == loginPIN)
            return true;

        return false;
    } 

    public void getDetails() {
        // Print above details (don't print account balance)
        System.out.println("User ID     : " + userId);
        System.out.println("First name  : " + fname);
        System.out.println("Last name   : " + lname);
        System.out.println("Email ID    : " + email);
        System.out.println("Phone number: " + phoneNum);
    }

    // the function transfers amount form user1 to user2
    public void transfer_money(User user1, User user2, long money) {
        user1.amount -= money;
        user2.amount += money;

        // get current date and time
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  

        String log = "User " + user1.userId + " transferred $" + money + " to " + user2.userId + " | " + formatter.format(date);
        userLogs.add(log);
        Admin.overallLogs.add(log);
    }
    
    public void viewHistory() {
        for (int i = 0; i < userLogs.size(); i++)
            System.out.println(userLogs.get(i));
    }
}

class savingsAccount extends User {

    // the user has an option to choose interest rate
    int interestRate;

    savingsAccount(String userId, String fname, String lname, String email, String phoneNum, int loginPIN, long amount, int interestRate) {
        super(userId, fname, lname, email, phoneNum, loginPIN, amount);

        this.accountType = "savings";
        this.interestRate = interestRate;

        // We have to add a function to add interest to the amount after a particular time period
    }
}

public class Bank_Account {

}

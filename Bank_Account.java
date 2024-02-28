package Bank;

class Account {
    long amount = 0L;

    public long getBalance() {
        return amount;
    }

    public void getDetails() {
        
    }
}

class User extends Account {
    String user_id; // given to user 9must have random numbers in it)
    String fname;
    String lname;
    String email;
    String phone_num;
    String Login_PIN;

    @Override public void getDetails() {
        // Print above details (don't print account balance)
    }

    // Transfer account function still requires more time to implement
    
    public void viewHistory() {
        // print an arraylist of transaction histories
    }
}

public class Bank_Account {

}
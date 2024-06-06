package Bank;

public class Bank {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.isAdmin("cs23b069", "Spongebob@123");
        
        // Dry running private admin features
        // System.out.println(admin.phoneNum);
        // System.out.println(admin.email);
        // System.out.println(admin.username);
        // System.out.println(admin.password);

        admin.viewUsers();

        // Dry running user and savingsAccount declaration and methods
        
        // User u1 = new User("323946346397", "Ashwin", "Ravichandran", "rashwin123@gmail.com", "9848817722", 1234, 1900000000);
        // System.out.println(u1.login(1234));
        // savingsAccount s1 = new savingsAccount("323946346397", "Ashwin", "Ravichandran", "rashwin123@gmail.com", "9848817722", 1234, 1900000000, 5);
        // System.out.println(s1.amount + s1.accountType + s1.interestRate);
    }
}

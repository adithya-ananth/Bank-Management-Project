package bankproject;
public class BankProject {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Firstpage().setVisible(true);
            }
        });
    }
}

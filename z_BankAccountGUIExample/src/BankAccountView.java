import javax.swing.*;

public class BankAccountView {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1500.0);

        JFrame frame = new JFrame();
        JPanel panel = new BankAccountPanel(bankAccount);

        frame.add(panel);
        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
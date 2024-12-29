import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class BankAccountPanel extends JPanel {
    private final BankAccount account;
    private final JTextField amountField = new JTextField(8);
 	private final JLabel balanceLabel = new JLabel();
 	private final DecimalFormat decimalFormat = new DecimalFormat("###.00");


    public BankAccountPanel(BankAccount bankAccount) {
        this.account = bankAccount;
        this.balanceLabel.setText("Balance: $" + decimalFormat.format(this.account.getBalance()));

        JLabel amountLabel = new JLabel("Amount: ");
        JButton withdrawButton = new JButton("Withdraw");
        JButton depositButton = new JButton("Deposit");

        WithdrawClickListener withdrawClickListener = new WithdrawClickListener();
        DepositClickListener depositClickListener = new DepositClickListener();

        withdrawButton.addActionListener(withdrawClickListener);
        depositButton.addActionListener(depositClickListener);

        add(amountLabel);
        add(amountField);
        add(withdrawButton);
        add(depositButton);
        add(balanceLabel);
    }

    class WithdrawClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String a = amountField.getText();
                double withdrawAmt = Double.parseDouble(a);
                account.withdraw(withdrawAmt);
                balanceLabel.setText("Balance: $" + decimalFormat.format(account.getBalance()));
            } catch (NumberFormatException exception) {
                amountField.setText("");
            }
        }
    }

    class DepositClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String a = amountField.getText();
                double depositAmt = Double.parseDouble(a);
                account.deposit(depositAmt);
                balanceLabel.setText("Balance: $" + decimalFormat.format(account.getBalance()));
            } catch (NumberFormatException exception) {
                amountField.setText("");
            }
        }
    }
}
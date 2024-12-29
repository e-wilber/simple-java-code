/**
 * Erin Wilber - ewilber
 * CIS171 22149
 * ${04-17-23}
 */

package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Model.CurrencyConverter;

public class CurrencyPanel extends JPanel{
	
	private JLabel title = new JLabel("									Currency Converter									");

	private JLabel dollarText;	
	private JTextField dollarField = new JTextField(5);
	
	private JButton calculateButton = new JButton("Calculate");
	
	private JLabel euroText = new JLabel("			to Euro: ");	
	private JTextField euroField = new JTextField(5);
	
	private JLabel gbpText = new JLabel("		to British Pounds: ");	
	private JTextField gbpField = new JTextField(5);
	
	private JButton clearButton = new JButton("Clear");
	
	private DecimalFormat df = new DecimalFormat("###.00");

	public CurrencyPanel() {
		super();
		// TODO Auto-generated constructor stub
		
		add(title);
		dollarText = new JLabel("Convert to US Dollar:");
		
		add(dollarText);
		add(dollarField);
		
		add(euroText);
		add(euroField);
		
		add(gbpText);
		add(gbpField);

		CalculateButtonListener calcButtonListener = new CalculateButtonListener();
		calculateButton.addActionListener(calcButtonListener);
		
		ClearButtonListener clearListener = new ClearButtonListener();
		clearButton.addActionListener(clearListener);
		
		add(calculateButton);
		add(clearButton);
	
	}
	
	class CalculateButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
			double amt = Double.parseDouble(dollarField.getText());
			CurrencyConverter cc = new CurrencyConverter(amt);
			
			euroField.setText(df.format(cc.getEuros())+"\u20AC");
			gbpField.setText(df.format(cc.getBritishPounds())+"\u00A3");
			
			}catch(NumberFormatException ex) {
				resetFields();
			}
		}
	}	
	
	class ClearButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			resetFields();
		}		
	}
	public void resetFields() {
	dollarField.setText("");
	euroField.setText("");
	gbpField.setText("");
	}
}

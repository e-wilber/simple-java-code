/**
 * Erin Wilber - ewilber
 * CIS171 22149
 * ${04-17-23}
 */

import javax.swing.JFrame;
import javax.swing.JPanel;

import View.CurrencyPanel;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		JPanel panel = new CurrencyPanel();
		
		frame.add(panel);
		
		frame.setSize(250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

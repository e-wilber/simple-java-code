/**
 * E Wilber - ewilber
 * CIS171 22149
 * ${04-24-23}
 */ 
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TargetMain {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new TargetPanel();
		
		frame.add(panel);
		panel.setBackground(Color.lightGray);
		frame.setSize(375, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}

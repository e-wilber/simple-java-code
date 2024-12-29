/**
 * E Wilber - ewilber
 * CIS171 22149
 * ${04-24-23}
 */ 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Popup;


@SuppressWarnings("serial")
public class TargetPanel extends JPanel {
	
	TargetDrawing drawing = new TargetDrawing();
	Popup pop;
	String message = "DON'T PRESS THIS BUTTON";
	
	public TargetPanel() {	
		
		JButton changeButton = new JButton(message);
		changeButton.setBackground(Color.red);
		
		
		drawing.setPreferredSize(new Dimension(400, 400));
		
		buttonListener l = new buttonListener();
		changeButton.addActionListener(l);
		
		add(drawing);
		add(changeButton);		
	}

	class buttonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			drawing.changeColor();
		}	
	}
}

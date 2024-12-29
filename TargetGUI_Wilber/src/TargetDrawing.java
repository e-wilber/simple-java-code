/**
 * E Wilber - ewilber
 * CIS171 22149
 * ${04-24-23}
 */ 
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class TargetDrawing extends JComponent {
	
	Color target = Color.white;
	Color face = Color.lightGray;
	Color eyes = Color.lightGray;
	Color brows = Color.lightGray;
	Color mouth = Color.lightGray;
	Color txtBubble = Color.lightGray;
	Color text = Color.lightGray;
	Color backGround = Color.white;
	String active = "white";
	
	public void paintComponent(Graphics g) {
		
		g.setColor(target);
		g.fillOval(25, 5, 350, 350);
		
		g.setColor(backGround);
		g.fillOval(50, 30, 300, 300);
		
		g.setColor(target);
		g.fillOval(75, 55, 250, 250);
		
		g.setColor(backGround);
		g.fillOval(100, 80, 200, 200);		
		
		g.setColor(target);
		g.fillOval(125, 105, 150, 150);
		
		g.setColor(backGround);
		g.fillOval(150, 130, 100, 100);	
		
		g.setColor(target);
		g.fillOval(175, 155, 50, 50);
//face		
		g.setColor(face);
		g.fillOval(230, 350, 50, 50);
//left eye		
		g.setColor(eyes);
		g.fillOval(240, 370, 10, 10);
//right eye		
		g.setColor(eyes);
		g.fillOval(260, 370, 10, 10);
//left eyebrow
		g.setColor(brows);
		g.fillRect(235, 365, 17, 3);	
//right eyebrow		
		g.setColor(brows);
		g.fillRect(257, 365, 17, 3);
		
		g.setColor(mouth);
		g.fillRect(245, 385, 20, 3);
//text bubble
		g.setColor(txtBubble);
		g.fillOval(275, 325, 100, 50);
//text
		g.setColor(text);
		g.drawString("Don't you dare", 290, 350);
		
		g.setColor(text);
		g.drawString("press it again!", 290, 362);
	}	
	
	public void changeColor() {
		
//		target = Color.pink;
		face = Color.orange;
		eyes = Color.black;
		brows = Color.darkGray;
		mouth = Color.black;
		txtBubble = Color.white;
		text = Color.black;
		
		if(active.equals("white")) {
			active = "pink";
			target = Color.pink;
		}else if(active.equals("pink")) {			
			active = "black";
			target = Color.black;
			eyes = Color.red;
			text = Color.lightGray;
			txtBubble = Color.lightGray;
		}else {
			active = "black";
			target = Color.red;
			eyes = Color.red;
			text = Color.lightGray;
			txtBubble = Color.lightGray;
		}
		repaint();
	}
}

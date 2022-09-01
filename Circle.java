package Hwgulled_HW2;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape{

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		int[] position = {randN, randN};  
		int diameter = 2 * randN;
		
		Ellipse2D.Double circle = new Ellipse2D.Double(position[0], position[1], diameter, diameter);
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(new Color(randomR, randomG, randomB));
		g2.fill(circle);
		g2.setColor(new Color(randomR, randomG, randomB));
		g2.draw(circle);
	}

}

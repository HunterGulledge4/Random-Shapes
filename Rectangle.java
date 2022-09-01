package Hwgulled_HW2;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Rectangle extends Shape {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D.Double rectangle = new Rectangle2D.Double(randX, randY, 2 * randN, randN);
		g2.setColor(new Color(randomR, randomG, randomB));
		g2.fill(rectangle);
		g2.setColor(new Color(randomR, randomG, randomB));
		g2.draw(rectangle);
	}


}

package Hwgulled_HW2;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class Square extends Shape {
	

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D.Double square = new Rectangle2D.Double(randX, randY, randN, randN);
		
		g2.setColor(new Color(randomR, randomG, randomB));
		g2.fill(square);
		g2.setColor(new Color(randomR, randomG, randomB));
		g2.draw(square);
		
	}

	private static final long serialVersionUID = 1L;
}

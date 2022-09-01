package Hwgulled_HW2;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Graphics;
import java.lang.Math;

public class Triangle extends Shape {
	
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		int[] xPoints = {randX, (randX + randN), ((randX + (randN / 2)))};
		int[] yPoints = {randY, randY, (int) (((randY * 2) + (Math.sqrt(3) * randN)) / 2)};
		
		Graphics2D g2 = (Graphics2D)g;
		Polygon triangle = new Polygon(xPoints, yPoints, 3);
		g2.setColor(new Color(randomR, randomG, randomB));
		g2.fillPolygon(triangle);

	}

}

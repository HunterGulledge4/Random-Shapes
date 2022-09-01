package Hwgulled_HW2;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.awt.Graphics;

public class Pentagon extends Shape {

	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D)g;
		
		//In order to get the x and y values precise, I had to use Path2D instead of Polygon.
		Path2D.Double pentagon = new Path2D.Double();
		pentagon.moveTo(randX, randY);
		pentagon.lineTo((randX+(0.81*randN)), (randY+(.59*randN)));
		pentagon.lineTo((randX+(randN/2)), (randY+(1.54*randN)));
		pentagon.lineTo((randX-(randN/2)), (randY+(1.54*randN)));
		pentagon.lineTo((randX-(0.81*randN)), (randY+(0.59*randN)));
		g2.setColor(new Color(randomR, randomG, randomB));
		g2.fill(pentagon);
	}
	private static final long serialVersionUID = 1L;
}

//Name: Hunter Gulledge
//BlazerID: Hwgulled
package Hwgulled_HW2;

import javax.swing.*;

import java.util.Random;

public class Shape extends JComponent {

	public int XMIN = 50;
	public int XMAX = 600;
	public int NMIN = 26;
	public int NMAX = 100;
	public int YMIN = 50;
	public int YMAX = 600;
	
		
		/*This parent class is where I create random values to utilize polymorphism by using 
		*these values in each subclass for each shape, that way each of the 5 shape sublcasses 
		have their own specific drawing instructions.*/
	
	
		//Random n for setting the random size of all the shapes.
		Random rand = new Random();
		int randN = rand.nextInt(NMIN, NMAX);

	
		//Random x and y values for the starting point for drawing the shapes.
		Random rand1 = new Random();
		int randX = rand1.nextInt(XMIN, XMAX);
		
		Random rand2 = new Random();
		int randY = rand2.nextInt(YMIN, YMAX);

		
		/*Random r, g, b values to use in the drawing instructions within each subclass
		for each shape.*/
		Random rand3 = new Random();
		int randomR = rand3.nextInt(0, 256); 
		
		Random rand4 = new Random();
		int randomG = rand4.nextInt(0, 256); 
		
		Random rand5 = new Random();
		int randomB = rand5.nextInt(0, 256); 

	private static final long serialVersionUID = 1L;
}

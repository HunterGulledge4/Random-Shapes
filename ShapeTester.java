//Name: Hunter Gulledge
//BlazerID: Hwgulled

package Hwgulled_HW2;

import java.util.Random;
import javax.swing.JFrame;

//import Hwgulled_Lab05.SomeGraphics;

public class ShapeTester extends Shape {

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		
		int WIDTH = 800;
		int HEIGHT = 800;
		frame.setSize(WIDTH,HEIGHT);
		frame.setTitle("CS 203 HW2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		/*Random number generated in order to randomly add a new shape to the frame
		* while using polymorphism to draw a shape according to its subclass' 
		* paintComponent instructions. I figured to design it this way for reusability 
		* and being able to be more specific with instructions to draw the shapes.
		*/
		
		Random rand5 = new Random();
		int randS = rand5.nextInt(1, 6); 
		
		if (randS == 1) {
			Shape s = new Square();
			frame.add(s);
			
		} else if(randS == 2) {
			Shape r = new Rectangle();
			frame.add(r);
			
		} else if(randS == 3) {
			Shape c = new Circle();
			frame.add(c);
			
		} else if(randS == 4) {
			Shape t = new Triangle();
			frame.add(t);
			
		} else if(randS == 5) {
			Shape p = new Pentagon();
			frame.add(p);
		}
		
		
		frame.setVisible(true);

	}
	private static final long serialVersionUID = 1L;
}

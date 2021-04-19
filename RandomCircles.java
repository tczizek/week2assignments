package week2;

import acm.program.*;
import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.Color;
import java.awt.*;

/*I need to build a program that generates a
a random size/color circle upon a click
*/

public class RandomCircles extends GraphicsProgram {
	/* Number of circles */
	private static final int RUNCIRCLES = 10;
	
	/* This sets the minimum radius in a circle */
	private static final double MIN_RAD = 3;
	
	/* This sets the max radius in a circle */
	private static final double MAX_RAD = 27;
	
	
	/* This builds the random circles then runs the loop adding
	 * until there are ten */
	public void run() {
		for (int i = 0; i < RUNCIRCLES; i++) {
			double r = rgen.nextDouble(MIN_RAD, MAX_RAD);
			double x = rgen.nextDouble(0, getWidth() - 2 * r);
			double y = rgen.nextDouble(0, getHeight() - 2 * r);
			GOval circle = new GOval(x, y, 2 * r, 2 * r);
			circle.setFilled(true);;
			circle.setColor(rgen.nextColor());;
			add(circle);
		}
	}
	
	/* This sets my private instance variable for randomizing*/
	private RandomGenerator rgen = RandomGenerator.getInstance();
	

}
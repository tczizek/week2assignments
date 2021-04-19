package week2;

import acm.program.GraphicsProgram;
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class DrawingLines extends GraphicsProgram {

	// THis adds my asynchronous listener when my program is called
	public void run() {
		addMouseListeners();
	}
	//This is called when the mouse is pressed to start line/
	public void mousePressed(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line = new GLine(x, y, x, y);
		add(line);
	}
	
	// This is called when mouse is dragged to create a end point*/
	public void mouseDragged(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line.setEndPoint(x, y);
		}

		//this declares the instance variable for line//
	private GLine line;


}

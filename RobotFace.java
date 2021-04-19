package week2;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class RobotFace extends GraphicsProgram {

	// These are my constants specifying the size of my features
    private static final int HEAD_WIDTH = 150;
    private static final int HEAD_HEIGHT = 250;
    private static final int EYE_RADIUS = 15;
    private static final int MOUTH_WIDTH = 75;
    private static final int MOUTH_HEIGHT = 25;

    public void run(){
        double rf = getWidth()/2;
        double hr = getHeight()/2;
        addHead(rf - HEAD_WIDTH/2, hr - HEAD_HEIGHT/2);
        addEye(rf - HEAD_WIDTH/4, hr - HEAD_HEIGHT/4);
        addEye(rf + HEAD_WIDTH/4, hr - HEAD_HEIGHT/4);
        addMouth(rf - MOUTH_WIDTH/2, hr + HEAD_HEIGHT/4);
    }

    private void drawRectangle(double x, double y, double width, double height, Color c){
        GRect rect = new GRect(x, y, width, height);
        rect.setFilled(true);
        rect.setColor(c);
        add(rect);
    }

    private void drawCircle(double rf, double hr, double r, Color c){
        double x = rf - r;
        double y = hr - r;
        GOval circle = new GOval(2*r, 2*r);
        circle.setColor(c);
        circle.setFilled(true);
        add(circle, x, y);
    }

    private void addHead(double x, double y){
        drawRectangle(x, y, HEAD_WIDTH, HEAD_HEIGHT, Color.GRAY);
    }

    private void addEye(double rf, double hr){
        drawCircle(rf, hr, EYE_RADIUS, Color.YELLOW);
    }

    private void addMouth(double x, double y){
        drawRectangle(x,y, MOUTH_WIDTH, MOUTH_HEIGHT, Color.WHITE);
    } 

}
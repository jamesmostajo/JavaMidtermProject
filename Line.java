/**
This is a template for a Java file.
@author James Ivan P. Mostajo (224396)
@version March 7, 2023
**/
/*
I have not discussed the Java language code in my program 
with anyone other than my instructor or the teaching assistants 
assigned to this course.
I have not used Java language code obtained from another student, 
or any other unauthorized source, either modified or unmodified.
If any Java language code or documentation used in my program 
was obtained from another source, such as a textbook or website, 
that has been clearly noted with a proper citation in the comments 
of my program.
*/
import java.awt.geom.*;
import java.awt.*;

/** 
Author defined line class with methods
that allows it to animate a line to move horizontally
**/
public class Line implements DrawingObject{
    
    private double xStart; private double yStart;
    private double xEnd; private double yEnd;
    private Color color;
    private float thickness;

    private Line2D.Double line;    

    public Line(double x1, double y1, double x2, double y2, float brushSize, Color c){
        xStart = x1; yStart = y1;
        xEnd = x2; yEnd = y2;
        thickness = brushSize;
        color = c;
       
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));
        line = new Line2D.Double(xStart, yStart, xEnd, yEnd);
        g2d.draw(line);
    }
    public void animateLine(double dx){
        xStart += dx;
        xEnd += dx;
    }
}
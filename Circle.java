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
Circle class defined by the author with methods
for drawing a circle or ellipse, with or without outline
**/ 
public class Circle implements DrawingObject{
    
    public double xPos; public double yPos;
    public double xSize; public double ySize;
    public Color color;

    // this creates a circle
    public Circle(double x, double y, double sz, Color c){
        xPos = x; yPos = y;
        xSize = sz; ySize = sz;
        color = c;
    }
    // this creates an ellipse
    public Circle(double x, double y, double xsz, double ysz, Color c){
        xPos = x; yPos = y;
        xSize = xsz; ySize = ysz;
        color = c;
    }
    public void draw(Graphics2D g2d){
        Ellipse2D.Double circle = new Ellipse2D.Double(xPos, yPos, xSize, ySize);
        g2d.setColor(color); g2d.fill(circle);
    }
    public void drawOutline(Graphics2D g2d){
        Ellipse2D.Double circle = new Ellipse2D.Double(xPos, yPos, xSize, ySize);
        g2d.setColor(color); g2d.fill(circle);
        g2d.setColor(Color.BLACK); g2d.draw(circle); 
    }
}
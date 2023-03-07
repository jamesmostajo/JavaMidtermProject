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
Square class defined by the author, has methods to support drawing
square or rectangle, with or without outline, with or without color,
or with gradient as its color
**/
public class Square implements DrawingObject{
    
    public double xPos; public double yPos;
    public double xSize; public double ySize;
    public Color color;

    private Rectangle2D.Double square;

    public Square(double x, double y, double sz, Color c){
        xPos = x; yPos = y;
        xSize = sz; ySize = sz;
        color = c;
    }

    public Square(double x, double y, double xSz, double ySz){
        xPos = x; yPos = y;
        xSize = xSz; ySize = ySz;
    }

    public Square(double x, double y, double xsz, double ysz, Color c){
        xPos = x; yPos = y;
        xSize = xsz; ySize = ysz;
        color = c;
    }

    public void draw(Graphics2D g2d){
        square = new Rectangle2D.Double(xPos, yPos, xSize, ySize);
        g2d.setColor(color); g2d.fill(square);
    }
    public void drawOutline(Graphics2D g2d){
        square = new Rectangle2D.Double(xPos, yPos, xSize, ySize);
        g2d.setColor(color); g2d.fill(square);
        g2d.setColor(Color.BLACK); g2d.draw(square); 
    }
    public void fillColor(Graphics2D g2d, GradientPaint paint){
        square = new Rectangle2D.Double(xPos, yPos, xSize, ySize);
        g2d.setPaint(paint);
        g2d.fill(square);
    }
}
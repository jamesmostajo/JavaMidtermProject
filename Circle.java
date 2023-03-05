import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;

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
import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;

public class Square implements DrawingObject{
    
    public double xPos; public double yPos;
    public double size;
    public Color color;

    public Square(double x, double y, double sz, Color c){
        xPos = x; yPos = y;
        size = sz;
        color = c;
    }

    public void draw(Graphics2D g2d){
        Rectangle2D.Double square = new Rectangle2D.Double(xPos, yPos, size, size);
        g2d.setColor(color); g2d.fill(square);
    }
    // public void adjustX(double distance){

    // }
    // public double getX(){
    //     return 
    // }
}
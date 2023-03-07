import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

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
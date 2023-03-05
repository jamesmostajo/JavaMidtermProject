import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;

public class Line implements DrawingObject{
    
    private double xStart; private double yStart;
    private double xEnd; private double yEnd;
    private Color color;
    private float thickness;

    public Line(double x1, double y1, double x2, double y2, float brushSize, Color c){
        xStart = x1; yStart = y1;
        xEnd = x2; yEnd = y2;
        thickness = brushSize;
        color = c;
    }

    public void draw(Graphics2D g2d){
        Line2D.Double line = new Line2D.Double(xStart, yStart, xEnd, yEnd);
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.draw(line);
    }
}
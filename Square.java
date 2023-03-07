import java.awt.geom.*;
import java.awt.*;

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
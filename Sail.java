import java.awt.geom.*;
import java.awt.*;

public class Sail implements DrawingObject{
    Path2D.Double sail = new Path2D.Double();
    public Square mast;
    public Square hanger;
    public Sail(double x, double y, float scale){
        sail.moveTo(x+(scale*64.40), y+(scale*14.30));
        sail.lineTo(x+(scale*390.20), y+(scale*14.30));
        sail.curveTo(x+(scale*390.20), y+(scale*14.30), x+(scale*468.10), y+(scale*148.40),x+(scale*390.20), y+(scale*282.60));
        sail.curveTo(x+(scale*220.60), y+(scale*148.50),x+(scale*64.40), y+(scale*282.60),x+(scale*64.40), y+(scale*282.60));
        sail.curveTo(x+(scale*64.40), y+(scale*282.60), x+(scale*-37.80), y+(scale*148.40), x+(scale*64.40), y+(scale*14.30));
        sail.closePath();
 
        mast = new Square(x+(scale*212), y+(scale*14.30), (scale*30), (scale*300), new Color(147,119,0));
        hanger = new Square(x+(scale*64.40), y+(scale*4.30), (scale*326), (scale*10), new Color(147,119,0));
    }
    public void draw(Graphics2D g2d){
        g2d.setStroke(new BasicStroke(1));
        hanger.drawOutline(g2d);
        mast.drawOutline(g2d);
        g2d.setColor(Color.WHITE);
        g2d.fill(sail);
        g2d.setColor(Color.BLACK); g2d.setStroke(new BasicStroke(1));
        g2d.draw(sail);

    }
}
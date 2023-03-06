import java.awt.geom.*;
import java.awt.*;

public class Trapezoid implements DrawingObject{
    
    Path2D.Double path = new Path2D.Double();
    public Trapezoid(double x, double y, float scale){ 
        path.moveTo(x+0,y+0);
        path.lineTo(x+(scale*8),y+(scale*-20));
        path.lineTo(x+(scale*107), y+(scale*-20));
        path.lineTo(x+(scale*115), y+0);
        path.closePath();
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(new Color(188,0,0));
        g2d.fill(path);
    }
}
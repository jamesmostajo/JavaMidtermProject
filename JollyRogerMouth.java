import java.awt.geom.*;
import java.awt.*;

public class JollyRogerMouth implements DrawingObject{
    Path2D.Double mouth = new Path2D.Double();
    public double x;
    public double y;
    public float scale;
    public JollyRogerMouth(double x, double y, float scale){
        this.x = x;
        this.y = y;
        this.scale = scale;

        mouth.moveTo(x+(scale*120.20), y+(scale*351.10));
        mouth.curveTo(x+(scale*120.20), y+(scale*351.10), x+(scale*81.00), y+(scale*440.80), x+(scale*164.80), y+(scale*440.80));
        mouth.curveTo(x+(scale*247.70), y+(scale*440.80), x+(scale*205.30), y+(scale*351.10), x+(scale*205.30), y+(scale*351.10));
        mouth.curveTo(x+(scale*205.30), y+(scale*351.10), x+(scale*164.80), y+(scale*373.90), x+(scale*120.20), y+(scale*351.10));
        mouth.closePath();
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(new Color(200,200,200));
        g2d.fill(mouth);
        g2d.setColor(Color.BLACK);
    }
}
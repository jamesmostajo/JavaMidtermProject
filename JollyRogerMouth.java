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
        
        mouth.moveTo(x+(scale*111.20), y+(scale*384.70));
        mouth.curveTo(x+(scale*111.20), y+(scale*384.70), x+(scale*164.90), y+(scale*421.10), x+(scale*215.50), y+(scale*384.70));
        
        mouth.moveTo(x+(scale*212.30), y+(scale*369.40));
        mouth.curveTo(x+(scale*212.30), y+(scale*369.40), x+(scale*169.20), y+(scale*399.20), x+(scale*114.30), y+(scale*369.40));
        
        mouth.moveTo(x+(scale*184.00), y+(scale*358.80));
        mouth.lineTo(x+(scale*189.90), y+(scale*397.50));     

        mouth.moveTo(x+(scale*135.80), y+(scale*395.70));
        mouth.lineTo(x+(scale*142.10), y+(scale*359.10));
        
        mouth.moveTo(x+(scale*163.60), y+(scale*361.50));
        mouth.lineTo(x+(scale*164.00), y+(scale*401.20));
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.BLACK);
        g2d.draw(mouth);
    }
}
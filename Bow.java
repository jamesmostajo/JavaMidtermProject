import java.awt.geom.*;
import java.awt.*;

public class Bow implements DrawingObject{
    Path2D.Double bow = new Path2D.Double();
    public float scale;
    public Bow(double x, double y, float scale){
        this.scale = scale;

        bow.moveTo(x+(scale*59.50), y+(scale*58.90));
        bow.lineTo(x+(scale*104.10), y+(scale*34.90));
        bow.lineTo(x+(scale*477.30), y+(scale*34.90));
        bow.lineTo(x+(scale*522.90), y+(scale*58.10));
        bow.lineTo(x+(scale*523.90), y+(scale*193.90));
        bow.lineTo(x+(scale*448.00), y+(scale*312.30));
        bow.curveTo(x+(scale*448.00), y+(scale*312.30), x+(scale*352.20), y+(scale*388.90), x+(scale*295.30), y+(scale*388.60));
        bow.curveTo(x+(scale*295.30), y+(scale*388.60), x+(scale*244.50), y+(scale*398.00), x+(scale*134.20), y+(scale*312.20));
        bow.lineTo(x+(scale*59.50), y+(scale*196.90));
        bow.lineTo(x+(scale*59.50), y+(scale*58.90));
        bow.closePath();
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(new Color(127,2,2));
        g2d.fill(bow);
        g2d.setColor(new Color(165,165,165));
        g2d.setStroke(new BasicStroke(scale*30f));
        g2d.draw(bow);
    }
}
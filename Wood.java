import java.awt.geom.*;
import java.awt.*;

public class Wood implements DrawingObject{
    Path2D.Double wood = new Path2D.Double();
    private double adjustedScale;
    private double internalScale = 1.02;

    public double x;
    public double y;
    public float scale;

    public Wood(double x, double y, float scale){
        this.x = x;
        this.y = y;
        this.scale = scale;

        adjustedScale = scale*internalScale;
        wood.moveTo(x+(adjustedScale*170.10),y+(adjustedScale*48.00));
        wood.lineTo(x+(adjustedScale*60.00), y+(adjustedScale*48.00));
        wood.curveTo(x+(adjustedScale*60.00), y+(adjustedScale*48.00), x+(adjustedScale*25.40), y+(adjustedScale*404.00), x+(adjustedScale*357.70), y+(adjustedScale*402.00));
        wood.curveTo(x+(adjustedScale*690.00), y+(adjustedScale*400.00), x+(adjustedScale*669.00), y+(adjustedScale*48.00), x+(adjustedScale*669.00), y+(adjustedScale*48.00));
        wood.lineTo(x+(adjustedScale*170.10), y+(adjustedScale*48.00));
        wood.closePath();
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(new Color(147,119,0));
        g2d.fill(wood);

        // 93, 150

        Bow bow = new Bow(x+(scale*77),y,scale);
        bow.draw(g2d);

        Front fr = new Front(x+(scale*157),y+(scale*100),scale*1f);
        fr.draw(g2d);
    }
}
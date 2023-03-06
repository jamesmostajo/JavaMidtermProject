import java.awt.geom.*;
import java.awt.*;

public class StrawHat implements DrawingObject{
    public RoundRectangle2D.Double hat;

    public Trapezoid strawHatStrip;
    public HatTop hatTop;

    public class HatTop implements DrawingObject{
        
        public Path2D.Double path;

        public HatTop(double x, double y, float scale){
            path = new Path2D.Double();
            path.moveTo(x+0,y+(scale*25));
            path.curveTo(x+(scale*27.5), y+(scale*-8.7), x+(scale*69.1), y+(scale*-8.1), x+(scale*97), y+(scale*25));
            path.closePath();
        }
        public void draw(Graphics2D g2d){
            g2d.setColor(new Color(204,160,18));
            g2d.fill(path);
        }
    }

    public StrawHat(double x, double y, float scale){

        hatTop = new HatTop(x+(scale*86),y+(scale*75),(scale*1.01f));
        hat = new RoundRectangle2D.Double(x+(scale*55),y+(scale*120),(scale*160),(scale*10),20,20);
        strawHatStrip = new Trapezoid(x+(scale*77),y+(scale*120),(scale*1.01f));
    }

    public void draw(Graphics2D g2d){
        g2d.setColor(new Color(204,160,18));
        g2d.fill(hat);
       
        hatTop.draw(g2d);

        strawHatStrip.draw(g2d);
    }
}
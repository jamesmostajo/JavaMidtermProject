import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;

// Gradient Tutorial from
// https://kodejava.org/how-do-i-create-a-gradient-paint-in-java-2d/

public class Background implements DrawingObject{
    GradientPaint sky;
    GradientPaint sea;
    public Background(){
        sky = new GradientPaint(532,0,new Color(28,117,188),532f,460.8f,new Color(68,178,229));
        sea = new GradientPaint(532f, 460.8f, new Color(68, 178, 229), 532f, 768, new Color(35,53,110));

    }
    public void draw(Graphics2D g2d){
        g2d.setPaint(sky);
        Rectangle2D.Double horizon = new Rectangle2D.Double(0,0,1064,460.8);
        g2d.fill(horizon);
        g2d.setPaint(sea);
        Rectangle2D.Double seas = new Rectangle2D.Double(0, 460, 1064, 768);
        g2d.fill(seas);
    }
}
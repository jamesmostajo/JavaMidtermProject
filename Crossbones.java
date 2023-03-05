import java.awt.*;
import java.awt.geom.*;

public class Crossbones implements DrawingObject{
    public double x;
    public double y;
    public double scale;

    public Crossbones(double x, double y, double scale){
        this.x = x;
        this.y = y;
        this.scale = scale;
    }
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        Bone bone1 = new Bone(x, y, scale*0.75);
        g2d.rotate(Math.toRadians(300), x+(bone1.boneWidth/2), y);
        bone1.draw(g2d);

        g2d.setTransform(reset);
        
        Bone bone2 = new Bone(x+(scale*285), y, scale*0.75);
        g2d.rotate(Math.toRadians(60),x+(scale*285)+(bone2.boneWidth/2),y);
        bone2.draw(g2d);

        g2d.setTransform(reset);
    }
}
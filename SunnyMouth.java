import java.awt.geom.*;
import java.awt.*;

public class SunnyMouth implements DrawingObject{
    public Circle snout;
    public Circle nose;

    public float scale;

    public Line mouthLine1;
    public Path2D.Double mouthLine2;
    public SunnyMouth(double x, double y, double faceMiddle,double eyeDist, float scale){
        
        this.scale = scale;

        snout = new Circle((faceMiddle-eyeDist), y, eyeDist*2, Color.WHITE);
        nose = new Circle(faceMiddle-(eyeDist/2), y+(scale*8), (eyeDist), (eyeDist/2), new Color(99, 59, 2));

        mouthLine1 = new Line(faceMiddle, y+(scale*9), faceMiddle, y+(scale*37.5), scale*1.5f, Color.BLACK);
        mouthLine2 = new Path2D.Double();
        mouthLine2.moveTo((faceMiddle-eyeDist)+(scale*1), y+eyeDist);
        mouthLine2.curveTo(faceMiddle, y+(eyeDist*1.35), faceMiddle, y+(eyeDist*1.35), (faceMiddle+eyeDist), y+eyeDist);
    }
    public void draw(Graphics2D g2d){
        snout.draw(g2d);

        mouthLine1.draw(g2d);
        g2d.setStroke(new BasicStroke(scale*1.5f));
        g2d.draw(mouthLine2);
        nose.draw(g2d);
    }
}
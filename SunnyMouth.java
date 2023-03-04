import java.awt.geom.*;
import java.awt.*;

public class SunnyMouth implements DrawingObject{
    public Circle snout;
    public Circle nose;

    public Line mouthLine1;
    public Path2D.Double mouthLine2;
    public SunnyMouth(double x, double y, double faceMiddle,double eyeDist){

        snout = new Circle((faceMiddle-eyeDist), y+75, eyeDist*2, Color.WHITE);
        nose = new Circle((faceMiddle-(eyeDist/4)), y+85, (eyeDist/2)*1.25, (eyeDist/4)*1.25, new Color(99, 59, 2));

        mouthLine1 = new Line(faceMiddle+2, y+90, faceMiddle+2, y+114, 2, Color.BLACK);
        mouthLine2 = new Path2D.Double();
        mouthLine2.moveTo((faceMiddle-eyeDist)+1, y+105);
        mouthLine2.curveTo(faceMiddle, faceMiddle+40, faceMiddle, faceMiddle+40, (faceMiddle+eyeDist)-1, y+105);
    }
    public void draw(Graphics2D g2d){
        snout.draw(g2d);

        mouthLine1.draw(g2d);
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(mouthLine2);
        nose.draw(g2d);
    }
}
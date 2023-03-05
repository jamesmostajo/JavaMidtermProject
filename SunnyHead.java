import java.awt.geom.*;
import java.awt.*;

public class SunnyHead implements DrawingObject{
    public final static double INTERNAL_SCALE = 155.25;
    public final static double INTERNAL_X = 71;
    public final static double INTERNAL_Y = 79;
    public Circle head;
    public Mane mane;

    public Circle leftEye;
    public Circle rightEye;
    public Circle leftPupil;
    public Circle rightPupil;

    public SunnyMouth sunnyMouth;

    public Circle nose;

    public SunnyHead(double x, double y, float scale){
        // 71, 79, 155.25
        
        head = new Circle(x,y,(scale*INTERNAL_SCALE), new Color(255,219,118));
        mane = new Mane(x-(scale*INTERNAL_X), y-(scale*INTERNAL_Y),scale);

        double faceMiddle = x + scale*INTERNAL_SCALE/2;
        double eyeDist = scale*30;
        // I won't simplify the equations for clarity's sake
        leftEye = new Circle(faceMiddle-((scale*35)+eyeDist), y+(scale*40), scale*35, Color.WHITE);
        rightEye = new Circle(faceMiddle+eyeDist, y+(scale*40), scale*35, Color.WHITE);
        leftPupil = new Circle((faceMiddle-((scale*35)+eyeDist))+(scale*5), y+(scale*45), scale*25, Color.BLACK);
        rightPupil = new Circle((faceMiddle+eyeDist)+(scale*5), y+(scale*45), scale*25, Color.BLACK);

        sunnyMouth = new SunnyMouth(x+(scale*INTERNAL_X), y+(scale*INTERNAL_Y), faceMiddle, eyeDist, scale);
    }
    public void draw(Graphics2D g2d){
        mane.draw(g2d);
        head.draw(g2d);
        leftEye.draw(g2d);
        rightEye.draw(g2d);
        leftPupil.draw(g2d);
        rightPupil.draw(g2d);
        sunnyMouth.draw(g2d);
        
      
    }
}
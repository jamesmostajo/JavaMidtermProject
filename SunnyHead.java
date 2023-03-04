import java.awt.geom.*;
import java.awt.*;

public class SunnyHead implements DrawingObject{
    public Circle head;
    public Mane mane;

    public Circle leftEye;
    public Circle rightEye;
    public Circle leftPupil;
    public Circle rightPupil;

    public SunnyMouth sunnyMouth;

    public SunnyHead(double x, double y, double scale){
        // 71, 79, 155.25
        head = new Circle(x,y,scale, new Color(255,219,118));
        mane = new Mane(x-71, y-79,1);

        double faceMiddle = x + (scale)/2;
        double eyeDist = 30;

        leftEye = new Circle(faceMiddle-(30+eyeDist), y+40, 35, Color.WHITE);
        rightEye = new Circle(faceMiddle+eyeDist, y+40, 35, Color.WHITE);
        leftPupil = new Circle((faceMiddle-(30+eyeDist))+5, y+45, 25, Color.BLACK);
        rightPupil = new Circle((faceMiddle+eyeDist)+5, y+45, 25, Color.BLACK);

        sunnyMouth = new SunnyMouth(x, y, faceMiddle, eyeDist);
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
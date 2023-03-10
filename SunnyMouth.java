/**
This is a template for a Java file.
@author James Ivan P. Mostajo (224396)
@version March 7, 2023
**/
/*
I have not discussed the Java language code in my program 
with anyone other than my instructor or the teaching assistants 
assigned to this course.
I have not used Java language code obtained from another student, 
or any other unauthorized source, either modified or unmodified.
If any Java language code or documentation used in my program 
was obtained from another source, such as a textbook or website, 
that has been clearly noted with a proper citation in the comments 
of my program.
*/
import java.awt.geom.*;
import java.awt.*;

/** 
Mouth of the Sunny, to be placed
on SunnyHead
**/
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
        snout.drawOutline(g2d);

        mouthLine1.draw(g2d);
        g2d.setStroke(new BasicStroke(scale*1.5f));
        g2d.draw(mouthLine2);
        nose.draw(g2d);
    }
}
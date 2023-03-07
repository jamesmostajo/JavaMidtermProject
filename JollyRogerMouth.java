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
This class draws the shape of the mouth
of the jolly roger using the path2d class
**/ 
 
public class JollyRogerMouth implements DrawingObject{
    Path2D.Double mouth = new Path2D.Double();
    public double x;
    public double y;
    public float scale;
    public JollyRogerMouth(double x, double y, float scale){
        this.x = x;
        this.y = y;
        this.scale = scale;
        
        /**
        To render the shape of the mouth:
        https://www.desmos.com/calculator/ebdtbxgbq0
        **/

        mouth.moveTo(x+(scale*120.20), y+(scale*351.10));
        mouth.curveTo(x+(scale*120.20), y+(scale*351.10), x+(scale*81.00), y+(scale*440.80), x+(scale*164.80), y+(scale*440.80));
        mouth.curveTo(x+(scale*247.70), y+(scale*440.80), x+(scale*205.30), y+(scale*351.10), x+(scale*205.30), y+(scale*351.10));
        mouth.curveTo(x+(scale*205.30), y+(scale*351.10), x+(scale*164.80), y+(scale*373.90), x+(scale*120.20), y+(scale*351.10));
        mouth.closePath();
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(new Color(200,200,200));
        g2d.fill(mouth);
        g2d.setColor(Color.BLACK);
    }
}
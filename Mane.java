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
Mane class to draw the mane of the sunny
drawn using the path2d class
**/ 
 
public class Mane implements DrawingObject{
    float scale;
    Path2D.Double mane = new Path2D.Double();
    public Mane(double x, double y, float scale){
        this.scale = scale;

        mane.moveTo(x+scale*(149.0), y+scale*(232.0));
        mane.curveTo(x+scale*(149.0), y+scale*(232.0), x+scale*(97.0), y+scale*(272.0), x+scale*(31.0), y+scale*(237.0));
        mane.curveTo(x+scale*(31.0), y+scale*(237.0), x+scale*(63.0), y+scale*(243.0), x+scale*(87.0), y+scale*(208.0));
        mane.curveTo(x+scale*(87.0), y+scale*(208.0), x+scale*(25.0), y+scale*(205.0), x+scale*(0.0), y+scale*(157.0));
        mane.curveTo(x+scale*(72.0), y+scale*(165.0), x+scale*(65.0), y+scale*(153.0), x+scale*(65.0), y+scale*(153.0));
        mane.curveTo(x+scale*(65.0), y+scale*(153.0), x+scale*(28.0), y+scale*(106.0), x+scale*(40.0), y+scale*(54.0));
        mane.curveTo(x+scale*(54.0), y+scale*(103.0), x+scale*(87.0), y+scale*(100.0), x+scale*(96.0), y+scale*(93.0));
        mane.curveTo(x+scale*(105.0), y+scale*(86.0), x+scale*(147.0), y+scale*(0.0), x+scale*(147.0), y+scale*(0.0));
        mane.lineTo(x+scale*(196.0), y+scale*(91.0));
        mane.curveTo(x+scale*(196.0), y+scale*(91.0), x+scale*(239.0), y+scale*(112.0), x+scale*(252.0), y+scale*(53.0));
        mane.curveTo(x+scale*(252.0), y+scale*(53.0), x+scale*(272.0), y+scale*(80.0), x+scale*(229.0), y+scale*(154.0));
        mane.curveTo(x+scale*(273.0), y+scale*(167.0), x+scale*(291.0), y+scale*(150.0), x+scale*(291.0), y+scale*(150.0));
        mane.curveTo(x+scale*(291.0), y+scale*(150.0), x+scale*(302.0), y+scale*(189.0), x+scale*(212.0), y+scale*(210.0));
        mane.curveTo(x+scale*(232.0), y+scale*(240.0), x+scale*(267.0), y+scale*(238.0), x+scale*(267.0), y+scale*(238.0));
        mane.curveTo(x+scale*(267.0), y+scale*(238.0), x+scale*(182.0), y+scale*(266.0), x+scale*(149.0), y+scale*(232.0));
        mane.closePath();
    }
    public void draw(Graphics2D g2d){
        g2d.setPaint(new Color(211, 131, 15));
        g2d.fill(mane);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(scale*.75f));
        g2d.draw(mane);
    }
}
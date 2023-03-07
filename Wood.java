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
Wooden part of the ship where the front 
and bow are located
**/ 
public class Wood implements DrawingObject{
    Path2D.Double wood = new Path2D.Double();
    private double adjustedScale;
    private double internalScale = 1.02;

    public double x;
    public double y;
    public float scale;

    public Wood(double x, double y, float scale){
        this.x = x;
        this.y = y;
        this.scale = scale;

        adjustedScale = scale*internalScale;
        wood.moveTo(x+(adjustedScale*170.10),y+(adjustedScale*48.00));
        wood.lineTo(x+(adjustedScale*60.00), y+(adjustedScale*48.00));
        wood.curveTo(x+(adjustedScale*60.00), y+(adjustedScale*48.00), x+(adjustedScale*25.40), y+(adjustedScale*404.00), x+(adjustedScale*357.70), y+(adjustedScale*402.00));
        wood.curveTo(x+(adjustedScale*690.00), y+(adjustedScale*400.00), x+(adjustedScale*669.00), y+(adjustedScale*48.00), x+(adjustedScale*669.00), y+(adjustedScale*48.00));
        wood.lineTo(x+(adjustedScale*170.10), y+(adjustedScale*48.00));
        wood.closePath();
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(new Color(147,119,0));
        g2d.fill(wood);

        Bow bow = new Bow(x+(scale*77),y,scale);
        bow.draw(g2d);

        Front front = new Front(x+(scale*157),y+(scale*100),scale*1f);
        front.draw(g2d);
    }
}
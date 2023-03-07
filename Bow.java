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
This class draws the bow part of the ship,
where the front part would be placed
**/ 
public class Bow implements DrawingObject{
    Path2D.Double bow = new Path2D.Double();
    public float scale;
    public Bow(double x, double y, float scale){
        this.scale = scale;

        bow.moveTo(x+(scale*59.50), y+(scale*58.90));
        bow.lineTo(x+(scale*104.10), y+(scale*34.90));
        bow.lineTo(x+(scale*477.30), y+(scale*34.90));
        bow.lineTo(x+(scale*522.90), y+(scale*58.10));
        bow.lineTo(x+(scale*523.90), y+(scale*193.90));
        bow.lineTo(x+(scale*448.00), y+(scale*312.30));
        bow.curveTo(x+(scale*448.00), y+(scale*312.30), x+(scale*352.20), y+(scale*388.90), x+(scale*295.30), y+(scale*388.60));
        bow.curveTo(x+(scale*295.30), y+(scale*388.60), x+(scale*244.50), y+(scale*398.00), x+(scale*134.20), y+(scale*312.20));
        bow.lineTo(x+(scale*59.50), y+(scale*196.90));
        bow.lineTo(x+(scale*59.50), y+(scale*58.90));
        bow.closePath();
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(new Color(127,2,2));
        g2d.fill(bow);
        g2d.setColor(new Color(165,165,165));
        g2d.setStroke(new BasicStroke(scale*30f));
        g2d.draw(bow);
    }
}
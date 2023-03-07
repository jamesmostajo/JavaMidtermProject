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
Trapezoid class defined by the author
to be used as the ribbon strip for the strawhat
**/
public class Trapezoid implements DrawingObject{
    
    Path2D.Double path = new Path2D.Double();
    public Trapezoid(double x, double y, float scale){ 
        path.moveTo(x+0,y+0);
        path.lineTo(x+(scale*8),y+(scale*-20));
        path.lineTo(x+(scale*107), y+(scale*-20));
        path.lineTo(x+(scale*115), y+0);
        path.closePath();
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(new Color(188,0,0));
        g2d.fill(path);
    }
}
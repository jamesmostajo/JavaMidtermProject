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
import java.awt.*;

/** 
The ship proper which contains everything pieced
together, has methods to animate the entire ship
and another method to animate the flag on the front
**/
public class ThousandSunny implements DrawingObject{
    public double shipX;
    public double shipY;
    public float shipSz;

    private UpperDeck sailsAndPosts;
    private Wood shipProper;
    private Circle shadow;

    public ThousandSunny(double x, double y, float scale){
        shipX = x;
        shipY = y;
        shipSz = scale;
    }
    public void draw(Graphics2D g2d){
        sailsAndPosts = new UpperDeck(shipX+0,shipY+0,(shipSz*1f));
        shipProper = new Wood(shipX+(shipSz*40), shipY+(shipSz*500), (shipSz*0.65f));
        shadow = new Circle(shipX+(shipSz*80), shipY+(shipSz*720), shipSz*400, shipSz*50, new Color(0,0,0, 120));
        
        shadow.draw(g2d);
        sailsAndPosts.draw(g2d);
        shipProper.draw(g2d);
        
    }
    public void adjustX(double dx){
        shipX += dx;
    }
    public void adjustSz(float dSz){
        shipSz += dSz;
    }
    public void adjustY(double dy){
        shipY += dy;
    }
    public float getSz(){
        return shipSz;
    }
    public void flagAnimate(){
        sailsAndPosts.animateFlag();
    }
}
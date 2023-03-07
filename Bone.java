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
This class draws the crossbones for the ship using the
line and shape class defined by the author
**/
public class Bone implements DrawingObject{
    public Line stem1;
    public Circle topCartilage1a;
    public Circle topCartilage2a;
    public Circle botCartilage1a;
    public Circle botCartilage2a;

    public Line stem2;
    public Circle topCartilage1b;
    public Circle topCartilage2b;
    public Circle botCartilage1b;
    public Circle botCartilage2b;

    public Bone(double x, double y, float scale, Color boneColor){

        stem1 = new Line(x-(scale*70), y-(scale*70), x+(scale*70), y+(scale*70), (scale*20), boneColor);
        stem2 = new Line(x+(scale*70), y-(scale*70), x-(scale*70), y+(scale*70), (scale*20), boneColor);

        topCartilage1a = new Circle(x-(scale*93), y-(scale*83), (scale*20), boneColor);
        topCartilage2a = new Circle(x-(scale*83), y-(scale*93), (scale*20), boneColor);

        botCartilage1a = new Circle(x+(scale*67), y+(scale*75), (scale*20), boneColor);
        botCartilage2a = new Circle(x+(scale*75), y+(scale*67), (scale*20), boneColor);

        topCartilage1b = new Circle(x+(scale*75), y-(scale*80), (scale*20), boneColor);
        topCartilage2b = new Circle(x+(scale*62), y-(scale*93), (scale*20), boneColor);

        botCartilage1b = new Circle(x-(scale*83), y+(scale*77), (scale*20), boneColor);
        botCartilage2b = new Circle(x-(scale*95), y+(scale*65), (scale*20), boneColor);
    }
    public void draw(Graphics2D g2d){
        stem1.draw(g2d);
        stem2.draw(g2d);

        topCartilage1a.draw(g2d);
        topCartilage2a.draw(g2d);
        botCartilage1a.draw(g2d);
        botCartilage2a.draw(g2d);

        topCartilage1b.draw(g2d);
        topCartilage2b.draw(g2d);
        botCartilage1b.draw(g2d);
        botCartilage2b.draw(g2d);
    }
}
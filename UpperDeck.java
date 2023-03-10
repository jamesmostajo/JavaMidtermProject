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
Contains the sails, the towers, and the jolly rogers
contains a method to animate the front flag
**/ 
public class UpperDeck implements DrawingObject{
    private double x, y;
    private float scale;

    public Sail frontSail;
    public Sail backSail;

    public Square watchtower;
    public Square watchtowerHat;
    public Square watchtowerHatStripe;

    public Square flagA;
    public Square flagB;

    public Line flagpole;

    public Square upperFlag;
    
    public JollyRoger jollyRoger1;
    public JollyRoger jollyRoger2;

    public static int flagVal = 0;

    public UpperDeck(double x, double y, float scale){
        this.x = x;
        this.y = y;
        this.scale = scale;

        frontSail = new Sail(x+(scale*50), y+(scale*250), scale);
        backSail = new Sail(x+(scale*80.3), y+(scale*150), scale*0.9f);
        
        watchtower = new Square(x+(scale*247), y+(scale*224.3), (scale*60), (scale*30), new Color(196,167,128));
        
        watchtowerHat = new Square(x+(scale*247), y+(scale*194.3), (scale*60), (scale*30), new Color(255, 219, 118));
        watchtowerHatStripe = new Square(x+(scale*267), y+(scale*194.3), (scale*20), (scale*35), new Color(127, 2, 2));

        flagA = new Square(x+(scale*265),y+(scale*159.3),(scale*35), Color.BLACK);
        

        flagpole = new Line(x+(scale*291.4), y+(scale*124.3), x+(scale*291.4), y+(scale*150.7), scale*7.5f, new Color(147,119,0));

        upperFlag = new Square(x+(scale*283.9),y+(scale*89.3),(scale*70), (scale*35), Color.BLACK);
        
        jollyRoger1 = new JollyRoger(x+(scale*137),y+(scale*215),(scale*1f));
        
        jollyRoger2 = new JollyRoger(x+(scale*300), y+(scale*85), (scale*0.15f));
    }
    public void draw(Graphics2D g2d){
        // i place it here to animate
        
        if (flagVal == 0){
            flagB = new Square(x+(scale*290),y+(scale*164.3),(scale*35), Color.BLACK);
        }else if (flagVal == 1){
            flagB = new Square(x+(scale*290),y+(scale*155.3),(scale*35), Color.BLACK);
        }

        backSail.draw(g2d);
        frontSail.draw(g2d);
        watchtowerHat.draw(g2d);
        watchtowerHatStripe.draw(g2d);
        watchtower.draw(g2d);
        flagA.draw(g2d);
        flagB.draw(g2d);
        flagpole.draw(g2d);
        upperFlag.draw(g2d);

        jollyRoger1.draw(g2d);
        jollyRoger2.draw(g2d);
    } 
    public static void animateFlag(){
        flagVal ^= 1;
    }
}
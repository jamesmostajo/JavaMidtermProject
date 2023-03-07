import java.awt.*;
import java.awt.geom.*;

public class Cloud implements DrawingObject{
    private double cloudX;
    private double cloudY;
    private double cloudSz;

    private Circle c1;
    private Circle c2;
    private Circle c3;
    private Circle c4;
    private Circle c5;
    private Circle c6;
    private Circle c7;
    private Circle c8;
    private Circle c9;
    private Circle c10;
    private Circle c11;
    private Circle c12;
    private Circle c13;
    private Circle c14;
    private Circle c15;
    private Circle c16;
    private Circle c17;
    private Circle c18;
    private Circle c19;
    private Circle c20;
    
    

    public Cloud(double x, double y, float scale){
        cloudX = x;
        cloudY = y;
        cloudSz = scale;
    }
    public void draw(Graphics2D g2d){
        c1 = new Circle(cloudX + cloudSz*40, cloudY+cloudSz*70, cloudSz*160, cloudSz*130, new Color(146,211,234));
        c2 = new Circle(cloudX + cloudSz*50, cloudY+cloudSz*50, cloudSz*270, cloudSz*400, new Color(146,211,234));
        c3 = new Circle(cloudX + cloudSz*-50, cloudY+cloudSz*120, cloudSz*200, cloudSz*250, new Color(146,211,234));
        c4 = new Circle(cloudX + cloudSz*150, cloudY+cloudSz*280, cloudSz*300, cloudSz*50, new Color(146,211,234));
        c5 = new Circle(cloudX + cloudSz*240, cloudY+cloudSz*190, cloudSz*150, cloudSz*150, new Color(146,211,234));

        c6 = new Circle(cloudX + cloudSz*550, cloudY+cloudSz*200, cloudSz*200, cloudSz*200, new Color(146,211,234));
        c7 = new Circle(cloudX + cloudSz*650, cloudY+cloudSz*120, cloudSz*130, cloudSz*130, new Color(146,211,234));
        c8 = new Circle(cloudX + cloudSz*620, cloudY+cloudSz*160, cloudSz*60, cloudSz*60, new Color(146,211,234));
        c9 = new Circle(cloudX + cloudSz*720, cloudY+cloudSz*70, cloudSz*100, cloudSz*100, new Color(146,211,234));
        c10 = new Circle(cloudX + cloudSz*700, cloudY+cloudSz*-125, cloudSz*800, cloudSz*800, new Color(146,211,234));

        c11 = new Circle(cloudX + cloudSz*-360, cloudY+cloudSz*70, cloudSz*160, cloudSz*130, new Color(146,211,234));
        c12 = new Circle(cloudX + cloudSz*-350, cloudY+cloudSz*50, cloudSz*270, cloudSz*400, new Color(146,211,234));
        c13 = new Circle(cloudX + cloudSz*-450, cloudY+cloudSz*120, cloudSz*200, cloudSz*250, new Color(146,211,234));
        c14 = new Circle(cloudX + cloudSz*-250, cloudY+cloudSz*280, cloudSz*300, cloudSz*50, new Color(146,211,234));
        c15 = new Circle(cloudX + cloudSz*-160, cloudY+cloudSz*190, cloudSz*150, cloudSz*150, new Color(146,211,234));
        c16 = new Circle(cloudX + cloudSz*-600, cloudY+cloudSz*200, cloudSz*200, cloudSz*200, new Color(146,211,234));

        c17 = new Circle(cloudX + cloudSz*-1000, cloudY+cloudSz*175, cloudSz*300, cloudSz*200, new Color(146,211,234));
        c18 = new Circle(cloudX + cloudSz*-1100, cloudY+cloudSz*220, cloudSz*300, cloudSz*100, new Color(146,211,234));
        c19 = new Circle(cloudX + cloudSz*-900, cloudY+cloudSz*150, cloudSz*80, cloudSz*50, new Color(146,211,234));
        c20 = new Circle(cloudX + cloudSz*-800, cloudY+cloudSz*220, cloudSz*150, cloudSz*150, new Color(146,211,234));


        c1.draw(g2d);
        c2.draw(g2d);
        c3.draw(g2d);
        c4.draw(g2d);
        c5.draw(g2d);

        c6.draw(g2d);
        c7.draw(g2d);
        c8.draw(g2d);
        c9.draw(g2d);
        c10.draw(g2d);

        c11.draw(g2d);
        c12.draw(g2d);
        c13.draw(g2d);
        c14.draw(g2d);
        c15.draw(g2d);
        c16.draw(g2d);

        c17.draw(g2d);
        c18.draw(g2d);
        c19.draw(g2d);
        c20.draw(g2d);
    }

}


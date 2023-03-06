import java.awt.*;
import java.awt.geom.*;

public class Front implements DrawingObject{
    public double x;
    public double y;
    public float scale;

    public Circle rim;
    public Circle rimHole;
    public Front(double x, double y, float scale){
        this.x = x;
        this.y = y;
        this.scale = scale;

        rim = new Circle(x+(scale*60),y-(scale*50),scale*300, new Color(216, 159, 0));
        rimHole = new Circle(x+(scale*110), y, scale*200, Color.BLACK);
    }
    public void draw(Graphics2D g2d){
        rim.draw(g2d);
        rimHole.draw(g2d);
        
        Bone frontCrossbone = new Bone(x+(scale*210),y+(scale*90),(scale*1.25f), new Color(226,226,226));
        frontCrossbone.draw(g2d);

        SunnyHead sunnyHead= new SunnyHead(x+(scale*133), y+(scale*1), scale);
        sunnyHead.draw(g2d);
    }
}
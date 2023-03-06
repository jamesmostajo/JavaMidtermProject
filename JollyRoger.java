import java.awt.*;
import java.awt.geom.*;

public class JollyRoger implements DrawingObject{
    public double x;
    public double y;
    public float scale;

    public Circle skullBase;

    public Circle leftEye;
    public Circle rightEye;

    public double eyeDist = 30;

    public Circle nose;

    public JollyRoger(double x, double y, float scale){
        this.x = x;
        this.y = y;
        this.scale = scale;

        skullBase = new Circle(x+(scale*75), y+(scale*75),(scale*120), new Color(226,226,226));

        leftEye = new Circle(x+(scale*90), y+(scale*135), (scale*25), Color.BLACK);
        rightEye = new Circle(x+(scale*155), y+(scale*135), (scale*25), Color.BLACK);

        nose = new Circle(x+(scale*127.5), y+(scale*160), (scale*15), Color.BLACK);
         

    }
    public void draw(Graphics2D g2d){

        Bone crossbones = new Bone(x+(scale*135),y+(scale*150),(scale*1f), new Color(183,183,183)); crossbones.draw(g2d);
        skullBase.draw(g2d);
        JollyRogerMouth mouth = new JollyRogerMouth(x+(scale*53),y+(scale*13),(scale*0.5f)); mouth.draw(g2d);
        leftEye.draw(g2d);
        rightEye.draw(g2d);
        nose.draw(g2d);
        StrawHat sh = new StrawHat(x,y,scale); sh.draw(g2d);

        
    }
}
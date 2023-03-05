import java.awt.*;
import java.awt.geom.*;

public class Bone implements DrawingObject{
    public Square stem;
    public Circle topCartilage1;
    public Circle topCartilage2;
    public Circle botCartilage1;
    public Circle botCartilage2;

    public double boneWidth = 30;
    public double boneHeight = 400;
    public double cartDistFromStem = 25;
    public double cartilageSize = 40;

    public Color boneColor = new Color(226,226,226);

    public Bone(double x, double y, double scale){

        stem = new Square(x, y, scale*boneWidth, scale*boneHeight, boneColor);
        topCartilage1 = new Circle((x+(scale*(boneWidth/2)))-scale*boneWidth, y-(cartDistFromStem*scale), scale*cartilageSize, boneColor);
        topCartilage2 = new Circle((x+(scale*boneWidth))-scale*(cartilageSize/2), y-(cartDistFromStem*scale), scale*cartilageSize, boneColor);
        
        botCartilage1 = new Circle((x+(scale*(boneWidth/2)))-scale*boneWidth, y+(scale*boneHeight)-(cartDistFromStem*scale), scale*cartilageSize, boneColor);
        botCartilage2 = new Circle((x+(scale*boneWidth))-(scale*(cartilageSize/2)), y+(scale*boneHeight)-(cartDistFromStem*scale), scale*cartilageSize, boneColor);
    }
    public void draw(Graphics2D g2d){
        stem.draw(g2d);
        topCartilage1.draw(g2d);
        topCartilage2.draw(g2d);

        botCartilage1.draw(g2d);
        botCartilage2.draw(g2d);
    }
}
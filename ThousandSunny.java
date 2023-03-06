import java.awt.*;

public class ThousandSunny implements DrawingObject{
    public double shipX;
    public double shipY;
    public float shipSz;

    private UpperDeck sailsAndPosts;
    private Wood shipProper;

    public ThousandSunny(double x, double y, float scale){
        shipX = x;
        shipY = y;
        shipSz = scale;
        
        sailsAndPosts = new UpperDeck(x+0,y+0,(scale*1f));

        shipProper = new Wood(x+(scale*40), y+(scale*500), (scale*0.65f));
    }
    public void draw(Graphics2D g2d){
        sailsAndPosts.draw(g2d);
        shipProper.draw(g2d);
    }   
}
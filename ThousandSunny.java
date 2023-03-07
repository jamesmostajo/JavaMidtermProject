import java.awt.*;

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
        // System.out.println("flagAnimate good");
        sailsAndPosts.animateFlag();
    }
}
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;


public class SceneCanvas extends JComponent{
    private int width;
    private int height;
    
    public ThousandSunny thousandSunny;

    public SceneCanvas(int w, int h){
        width = w; height = h;
        ArrayList<DrawingObject> drawingObject = new ArrayList<DrawingObject>();
        setPreferredSize(new Dimension(width,height));

        thousandSunny = new ThousandSunny(0,0,0.6f);
    }
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Background bg = new Background();
        bg.draw(g2d);

        thousandSunny.draw(g2d);
    }
    public ThousandSunny getShip(){
        return thousandSunny;
    }
    


}
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;


public class SceneCanvas extends JComponent{
    private int width;
    private int height;
    
    public ThousandSunny thousandSunny;
    public Background bg;
    public Wave wave;

    public SceneCanvas(int w, int h){
        width = w; height = h;
        ArrayList<DrawingObject> drawingObject = new ArrayList<DrawingObject>();
        setPreferredSize(new Dimension(width,height));

        thousandSunny = new ThousandSunny(400,40,0.35f);
        wave = new Wave(150);
    }
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        bg = new Background();
        bg.draw(g2d);

        wave.draw(g2d);
        thousandSunny.draw(g2d);
        
    }
    public ThousandSunny getShip(){
        return thousandSunny;
    }
    public Background getBG(){
        // System.out.println("getBG works");
        return bg;
    }
    public Wave getWave(){
        return wave;
    }


}
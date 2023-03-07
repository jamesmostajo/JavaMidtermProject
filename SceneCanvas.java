import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SceneCanvas extends JComponent{
    private int width;
    private int height;
    

    public ArrayList<DrawingObject> drawingObject;

    public SceneCanvas(int w, int h){
        width = w; height = h;
        drawingObject = new ArrayList<DrawingObject>();
        setPreferredSize(new Dimension(width,height));
        
        drawingObject.add(new Background());
        drawingObject.add(new Wave(150));
        drawingObject.add(new ThousandSunny(400,50,0.35f));
    }
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        for (DrawingObject item: drawingObject){
            item.draw(g2d);
        }
    }
    public Background getBG(){
        return (Background) drawingObject.get(0);
    }
    public Wave getWave(){
        return (Wave) drawingObject.get(1);
    }
    public ThousandSunny getShip(){
        return (ThousandSunny) drawingObject.get(2);
    }
}
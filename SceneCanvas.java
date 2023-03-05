import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;

public class SceneCanvas extends JComponent{
    private int width;
    private int height;
    public SceneCanvas(int w, int h){
        width = w; height = h;
        ArrayList<DrawingObject> drawingObject = new ArrayList<DrawingObject>();

        setPreferredSize(new Dimension(width,height));
    }
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Square bg = new Square(0,0,width, height, new Color(151,235,255));
        bg.draw(g2d);
        
        UpperDeck ud = new UpperDeck(0,0,1);
        ud.draw(g2d);

        Wood hull = new Wood(40, 500, 0.65f);
        hull.draw(g2d);        

        // JollyRogerMouth mouth = new JollyRogerMouth(90, 90, 1);
        // mouth.draw(g2d);
      
    }
}
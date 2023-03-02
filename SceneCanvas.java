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

        //this part is a test and not part of the final program
        // Rectangle2D.Double bg = new Rectangle2D.Double(0,0, width, height);
        // g2d.setColor(Color.BLUE); g2d.fill(bg);

        // Path2D.Double line = new Path2D.Double();
        // line.moveTo(width, height); line.lineTo(100,100);
        // g2d.setColor(Color.WHITE); g2d.draw(line);
        // end of test
        
        Square sq1 = new Square(0,0, 100,(Color.BLUE));
        sq1.draw(g2d);
    }
}
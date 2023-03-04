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
        // Square bg = new Square(0,0, width, height, Color.BLUE); bg.draw(g2d);
        // Line l1 = new Line(0,0,100, 100, 5, Color.BLACK); l1.draw(g2d);
        // Path2D.Double line = new Path2D.Double();
        // line.moveTo(width, height); line.lineTo(100,100);
        // g2d.setColor(Color.WHITE); g2d.draw(line);
        // end of test
        
        // Square sq1 = new Square(0,0, 100,(Color.CYAN)); sq1.draw(g2d);
        // Square sq2 = new Square(0, 150, 100, 150,(Color.CYAN)); sq2.draw(g2d);
        // Circle c1 = new Circle(50,50, 20, Color.RED); c1.draw(g2d);
        // Circle c2 = new Circle(100, 100, 30, 40, Color.GREEN); c2.draw(g2d);
        
        SunnyHead sunnyHead= new SunnyHead(250, 250, 155.25);
        sunnyHead.draw(g2d);
    }
}
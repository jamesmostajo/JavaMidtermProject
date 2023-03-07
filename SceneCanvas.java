/**
This is a template for a Java file.
@author James Ivan P. Mostajo (224396)
@version March 7, 2023
**/
/*
I have not discussed the Java language code in my program 
with anyone other than my instructor or the teaching assistants 
assigned to this course.
I have not used Java language code obtained from another student, 
or any other unauthorized source, either modified or unmodified.
If any Java language code or documentation used in my program 
was obtained from another source, such as a textbook or website, 
that has been clearly noted with a proper citation in the comments 
of my program.
*/
import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
SceneCanvas class where paint component is called
and all drawing objects are drawn, auxillary methods
are used for animating the objects
**/ 
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
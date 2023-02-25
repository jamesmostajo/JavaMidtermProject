import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SceneCanvas extends JComponent{
    public SceneCanvas(){
        ArrayList<DrawingObject> drawingObject = new ArrayList<DrawingObject>();

        // Add drawing objects to drawingObject vector
        // this.setPreferredSize(1024,768);
    }
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
    }
}
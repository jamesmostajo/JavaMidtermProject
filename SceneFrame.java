import javax.swing.*;
import java.awt.*;
public class SceneFrame{
    private JFrame frame;
    private int height, width;

    public SceneFrame(){
        frame = new JFrame();
        SceneCanvas sCanvas = new SceneCanvas();
    }
    public void setUpGUI(){
        // frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Midterm Project - Mostajo, James Ivan - 224396"); 
        frame.setVisible(true);
    }
}
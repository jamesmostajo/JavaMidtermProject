import javax.swing.*;
import java.awt.*;
public class SceneFrame{
    private JFrame frame;
    private int height, width;

    private SceneCanvas sCanvas;

    public SceneFrame(int w, int h){
        width = w; height = h;
        frame = new JFrame();
        sCanvas = new SceneCanvas();
    }
    public void setUpGUI(){
        // frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Midterm Project - Mostajo, James Ivan - 224396"); 
        frame.setSize(1024, 768);
        frame.add(sCanvas);
        frame.pack();

        frame.setVisible(true);
    }
}
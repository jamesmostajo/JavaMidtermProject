import javax.swing.*;
import java.awt.*;
public class SceneFrame{
    private JFrame frame;
    private int height, width;

    private SceneCanvas sCanvas;

    public SceneFrame(int w, int h){
        width = w; height = h;
        frame = new JFrame();
        sCanvas = new SceneCanvas(width, height);
    }
    public void setUpGUI(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Midterm Project - Mostajo, James Ivan - 224396"); 

        frame.add(sCanvas);
        frame.pack();

        frame.setVisible(true);
    }
}
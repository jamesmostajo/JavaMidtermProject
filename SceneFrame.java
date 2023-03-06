import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SceneFrame{
    private JFrame frame;
    private int height, width;

    private JButton left;
    private JButton scaleUp;
    private JButton scaleDown;
    private JButton right;


    private SceneCanvas sCanvas;

    public SceneFrame(int w, int h){
        width = w; height = h;
        frame = new JFrame();
        sCanvas = new SceneCanvas(width, height);
        
        left = new JButton("left");
        scaleUp = new JButton("front");
        scaleDown = new JButton("back");
        right = new JButton("right");
    }
    public void setUpGUI(){
        Container cp = frame.getContentPane();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Midterm Project - Mostajo, James Ivan - 224396"); 

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,4));
        buttonsPanel.add(left);
        buttonsPanel.add(scaleUp);
        buttonsPanel.add(scaleDown);
        buttonsPanel.add(right);

        cp.add(buttonsPanel, BorderLayout.SOUTH);
        cp.add(sCanvas, BorderLayout.CENTER);
        // frame.pack();

        frame.setVisible(true);
    }
    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            Object o = ae.getSource();
            if (o == left){
                sCanvas.getShip().adjustX(-100);
                sCanvas.repaint();
                // System.out.println("left");
            }else if (o == right) {
                sCanvas.getShip().adjustX(100);
                sCanvas.repaint();
                // System.out.println("right");
            }else if (o == scaleUp){
                sCanvas.getShip().adjustSz(0.05f);
                sCanvas.repaint();
            }else if (o == scaleDown){
                sCanvas.getShip().adjustSz(-0.05f);
                sCanvas.repaint();
            }
        }
    }
    public void setUpButtonListener(){
        ButtonListener bl = new ButtonListener();
        left.addActionListener(bl);
        right.addActionListener(bl);
        scaleUp.addActionListener(bl);
        scaleDown.addActionListener(bl);
    }
}
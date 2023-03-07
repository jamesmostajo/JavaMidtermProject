import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SceneFrame{
    private JFrame frame;
    private int height, width;

    private SceneCanvas sCanvas;

    private Timer bounceTimer;
    private Timer scaleTimer;
    private Timer flagTimer;
    private Timer cloudTimer;
    private Timer waveTimer;
    private Timer addNewWavesTimer;
    private double rad = 0;

    public SceneFrame(int w, int h){
        width = w; height = h;
        frame = new JFrame();
        sCanvas = new SceneCanvas(width, height);
    }
    public void setUpGUI(){
        Container cp = frame.getContentPane();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Midterm Project - Mostajo, James Ivan - 224396"); 

        frame.add(sCanvas);
        frame.pack();

        frame.setVisible(true);
    }
    // private class ButtonListener implements ActionListener{
    //     @Override
    //     public void actionPerformed(ActionEvent ae){
    //         Object o = ae.getSource();
    //         if (o == left){
    //             sCanvas.getShip().adjustX(-100);
    //             sCanvas.repaint();
    //             // System.out.println("left");
    //         }else if (o == right) {
    //             sCanvas.getShip().adjustX(100);
    //             sCanvas.repaint();
    //             // System.out.println("right");
    //         }else if (o == scaleUp){
    //             sCanvas.getShip().adjustSz(0.05f);
    //             sCanvas.repaint();
    //         }else if (o == scaleDown){
    //             sCanvas.getShip().adjustSz(-0.05f);
    //             sCanvas.repaint();
    //         }
    //     }
    // }
    private class TimeListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            Object o = ae.getSource();
            if (o == bounceTimer){
                rad += 0.1;
                double size = sCanvas.getShip().getSz();
                sCanvas.getShip().adjustY(Math.sin(rad)*size*2);
                sCanvas.getShip().adjustX(-0.1);
                sCanvas.repaint();
            }else if (o == scaleTimer){
                sCanvas.getShip().adjustSz(0.0002f);
                sCanvas.repaint();
            }else if (o == flagTimer){
                sCanvas.getShip().flagAnimate();
                sCanvas.repaint();  
            }else if (o == cloudTimer){
                sCanvas.getBG().adjustX(0.45);
                sCanvas.repaint();
            }else if (o == waveTimer){
                for(Line l: sCanvas.getWave().getList()){
                    l.animateLine(5);
                }
                sCanvas.repaint();
            }else if (o == addNewWavesTimer){
                sCanvas.getWave().addNewWaveLines();
                sCanvas.repaint();
            }
        }
    }
    public void setUpListeners(){
        TimeListener tl = new TimeListener();
        bounceTimer = new Timer(100, tl);
        bounceTimer.start();
        scaleTimer = new Timer(10, tl);
        scaleTimer.start();
        flagTimer = new Timer(1000, tl);
        flagTimer.start();
        cloudTimer = new Timer(100,tl);
        cloudTimer.start();
        waveTimer = new Timer(100,tl);
        waveTimer.start();
        addNewWavesTimer = new Timer(250, tl);
        addNewWavesTimer.start();
    }
}
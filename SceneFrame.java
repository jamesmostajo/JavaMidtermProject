import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.IOException;
import java.io.File;

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

    /** Timer and TimeListener tutorials:
     https://docs.oracle.com/javase/7/docs/api/javax/swing/Timer.html
     https://www.youtube.com/watch?v=CQi7XorjECs

     Audio and BGM tutorials:
     https://www.youtube.com/watch?v=wJO_cq5XeSA
    */
    public static void setUpAudio(){
        try{
            File file = new File("WeAre.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		    Clip clip = AudioSystem.getClip();
		    clip.open(audioStream);
            clip.start();
         }
        catch(Exception e){
            System.out.println("e");
        }
    }
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
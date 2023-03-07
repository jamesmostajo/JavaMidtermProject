import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.awt.event.*;

public class Wave implements DrawingObject{
    public ArrayList<Line> waveLines;
    public Wave(int numLines){
        Random rand = new Random();
        waveLines = new ArrayList<Line>();
        for (int i = 0; i < numLines; i++) {
            double x = rand.nextInt(1064);
            double y = rand.nextInt(460);
            double length = rand.nextInt(100);
            waveLines.add(new Line(x, y + 308, x + length, y+308, 2, new Color(255,255,255,140)));
        }   
    }
    public void draw(Graphics2D g2d){
        for (Line line: waveLines){
            line.draw(g2d);
        }
    }
    public ArrayList<Line> getList(){
        // System.out.println("waveLines returned");
        return waveLines;
    }
    public void addNewWaveLines(){    
        Random rand = new Random();
        double x = rand.nextInt(1064);
        double y = rand.nextInt(460);
        double length = rand.nextInt(100);
        waveLines.add(new Line(-(length + 100), y + 308, length - 100, y + 308, 2, new Color(255,255,255,140)));

    }
}   
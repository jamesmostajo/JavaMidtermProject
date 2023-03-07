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
import java.awt.*;
import java.util.*;

/** 
Initially generates the waveline has a method
that allows time listener to generate more wave lines
at an interval
**/ 
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
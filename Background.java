import java.awt.*;

// Gradient Tutorial from
// https://kodejava.org/how-do-i-create-a-gradient-paint-in-java-2d/

public class Background implements DrawingObject{
    GradientPaint sky;
    GradientPaint sea;
    public Cloud cloud;
    private static double cloudX = 0;
    public Background(){
        sky = new GradientPaint(532,0,new Color(28,117,188),532f,460.8f,new Color(68,178,229));
        sea = new GradientPaint(532f, 460.8f, new Color(68, 178, 229), 532f, 768, new Color(35,53,110));
    }
    public void draw(Graphics2D g2d){
        Square horizon = new Square(0,0,1064*3,460.8);
        horizon.fillColor(g2d, sky);

        cloud = new Cloud(cloudX,0,1f);
        cloud.draw(g2d);
        
        Square seas = new Square(0, 307.2, 1064*3, 768);
        seas.fillColor(g2d, sea);

        Line seaLine = new Line(0, 307.2, 1064, 307.2, 1, new Color(96,192,226));
        seaLine.draw(g2d);

    }   
    public static void adjustX(double dx){
        cloudX += dx;
    }
    
}
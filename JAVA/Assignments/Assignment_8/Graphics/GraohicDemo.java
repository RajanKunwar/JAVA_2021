import javax.swing.*;

import java.awt.*;
import java.awt.Graphics;

public class GraohicDemo extends JPanel
{
public GraohicDemo()
{
 JFrame frame=new JFrame("Polygons.");
 frame.add(this);

 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(1200,1200);
 frame.setLocationRelativeTo(null);
 frame.setVisible(true);
}

public void paint(Graphics g)
{
 super.paint(g);

 int[]x={0,15,20};

 int[]y={20,0,10};

 
 g.setColor(new Color(0,0,255));

 g.drawPolygon(x,y,3);

 int[]x1={10,25,35};

 int[]y1={30,15,25};

 
 g.setColor(new Color(0,255,0));

 g.fillPolygon(x1,y1,3);

 int[]x2={40,340,120,540,40,40};

 int[]y2={30,230,230,530,530,30};
 
 g.setColor(new Color(0,0,255));

 g.fillPolygon(x2,y2,5);

 int[]x3={50,310,90,505,50,50};

 int[]y3={50,220,220,520,520,50};
 
 g.setColor(new Color(255,0,0));

 g.fillPolygon(x3,y3,5);

 g.setColor(Color.WHITE);        
 g.fillArc(100,350,125,125,0,360);  

 g.fillArc(100,155,65,35,0,-180); 

}
public static void main(String[]args)
{
 GraohicDemo dt=new GraohicDemo();
}

}

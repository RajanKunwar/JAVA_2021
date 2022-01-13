import java.applet.Applet;  
import java.awt.Graphics;  
  
public class PassingParameter extends Applet{  
    public void paint(Graphics g){  
    String str=getParameter("Hello there.");  
    g.drawString(str,96, 100);  
    }  
}  
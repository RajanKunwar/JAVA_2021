import java.applet.Applet;
import java.awt.Graphics;
class LifeCycleApplet extends Applet{
    public void init(){
        System.out.println("Initialization of the applet.");
    }
    public void start(){
        System.out.println("Starting the applet.");
    }
    public void paint(Graphics graphics){
        graphics.drawString("I Dont Have Applet Viewer.", 250, 350);
    }
    public void stop(){
        System.out.println("So, I Am not seeing its result.");
    }

    public void destory(){
        System.out.println("Thank you & Bye.");
    }
}
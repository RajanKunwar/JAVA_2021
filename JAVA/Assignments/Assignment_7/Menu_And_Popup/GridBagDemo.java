import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;
 
public class GridBagDemo extends JFrame {
 
    GridBagDemo()
    {
         setTitle("GridBagLayoutDemo");
         JPanel p = new JPanel();
         p.setLayout(new GridBagLayout());
         GridBagConstraints c = new GridBagConstraints();
         c.insets = new Insets(2, 2, 2, 2);
 
        c.gridx = 0;
         c.gridy = 0;
 
        // increases components width by 10 pixels
        c.ipadx = 15;
 
        // increases components height by 50 pixels
        c.ipady = 50;
 
        // constraints passed in
        p.add(new JButton("Click"), c);
 
        // column 1
        c.gridx = 1;
 
        // increases components width by 70 pixels
        c.ipadx = 90;
 
        // increases components height by 40 pixels
        c.ipady = 40;
 
        // constraints passed in
        p.add(new JButton("click ME"), c);
 
        c.gridx = 0;
        c.gridy = 1;
 
        // increases components width by 20 pixels
        c.ipadx = 20;
 
        // increases components height by 20 pixels
        c.ipady = 20;
        p.add(new JButton("Me Click"), c);
 
        // increases components width by 10 pixels
        c.ipadx = 10;
         c.gridx = 3;
 
        p.add(new JButton("Clicking"), c);
        WindowListener wndCloser = new WindowAdapter() {
 
            public void windowClosing(WindowEvent e)
            {
 
                System.exit(0);
            }
        };
 
        addWindowListener(wndCloser);
 
        getContentPane().add(p);
 
        setSize(600, 400);
        setVisible(true);
    }
 
    public static void main(String[] args)
    {
         new GridBagDemo();
    }
}
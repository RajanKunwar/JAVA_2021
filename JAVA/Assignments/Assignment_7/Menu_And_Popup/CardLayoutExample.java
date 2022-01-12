import java.awt.*;    
import javax.swing.*;   
import java.awt.event.*;    
  
public class CardLayoutExample extends JFrame implements ActionListener  
{    
  
CardLayout crd;    
  
JButton btn1, btn2, btn3;    
Container cPane;   
  
CardLayoutExample()  
{    
  
cPane = getContentPane();    
  
crd = new CardLayout();    
  
cPane.setLayout(crd);    
  
// creating the buttons  
btn1 = new JButton("Apple");    
btn2 = new JButton("For");    
btn3 = new JButton("Health");    
  
// adding listeners to it  
btn1.addActionListener(this);    
btn2.addActionListener(this);    
btn3.addActionListener(this);    
  
cPane.add("a", btn1); 
cPane.add("b", btn2);   
cPane.add("c", btn3); 
            
}    
public void actionPerformed(ActionEvent e)   
{     
crd.next(cPane);    
}    
  
public static void main(String argvs[])   
{       
CardLayoutExample crdl = new CardLayoutExample();   
  
crdl.setSize(300, 300);    
crdl.setVisible(true);    
crdl.setDefaultCloseOperation(EXIT_ON_CLOSE);    
}    
}    
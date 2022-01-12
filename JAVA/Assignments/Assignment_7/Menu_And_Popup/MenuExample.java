import java.awt.*;  
import java.awt.event.*;  

class MenuExample  
{  
     MenuExample(){  
         Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  
         Menu menu=new Menu("File");  
         Menu menu1=new Menu("Edit");  
         Menu menu2=new Menu("View"); 
         Menu menu3=new Menu("Open"); 
         Menu submenu=new Menu("New");  
         MenuItem A=new MenuItem("Save");  
         MenuItem B=new MenuItem("Class");    
         MenuItem C=new MenuItem("Teast");  
         MenuItem D=new MenuItem("Folder");
         MenuItem E=new MenuItem("Window");
         MenuItem F=new MenuItem("Panel");  
         menu.add(A);  
         menu.add(B);   
         submenu.add(C);  
         submenu.add(D);
         menu2.add(E);
         menu2.add(F);  
         menu.add(submenu);  
         mb.add(menu);
         mb.add(menu1);
         mb.add(menu2); 
         mb.add(menu3);  

          PopupMenu popupmenu = new PopupMenu("Edit");   
         MenuItem file = new MenuItem("File");  
         file.setActionCommand("File");  
         MenuItem edit = new MenuItem("Edit");  
         edit.setActionCommand("Edit");  
         MenuItem view = new MenuItem("View");  
         view.setActionCommand("View");
         MenuItem open = new MenuItem("Open");  
         open.setActionCommand("Open");       
         popupmenu.add(file);  
         popupmenu.add(edit);  
         popupmenu.add(view);
         popupmenu.add(open);        
         f.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popupmenu.show(f , e.getX(), e.getY());  
            }                 
         });  
         f.add(popupmenu);   
         f.setMenuBar(mb);  
         f.setSize(500,500);  
         f.setLayout(null);  
         f.setVisible(true);  


         f. addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                System.exit(0);   
            }     
            });        
}  
public static void main(String args[])  
{  
new MenuExample();  
}  
}  

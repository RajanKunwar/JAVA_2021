class Super {
    int value = 20;
   }
   
   class Example extends Super {
    int value = 10;
    void display() {
     System.out.println(super.value);// prints super value 
    }
    void display2(int value){
     this.value = value;//changes to new value 
     System.out.println(this.value);// prints new value
    }
   
    public static void main(String args[]) {
     Example e = new Example();
     e.display();//this returns value from the super class that is parent class Super.
     e.display2(45);//new value is displayed
    }
   }
final class Final{  //thid ensures that it cannot be extended to other class.
 public static void main(String[] args) {
     final double PI = 3.1415;//this value cannot be changed to another because this must be constant throughout the program.
     int radius = 7;
     double area = PI*radius*radius;
     System.out.println("The area of circle is:"+area);
 }
}

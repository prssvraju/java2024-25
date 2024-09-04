import java.io.*;
class Outer
{
    private  int width;
    private  int length;
    Outer(int w,int h)
    {
        width=w;
        length=h;
    }
    public int area()
    {
        return width*length;
    }
    public void displayOuter()
    {
        Inner in = new Inner();
        in.displayInner();
    }
    class Inner
    {
        private int rate =10;
        public void displayInner()
        {
            System.out.println("Fencing Cost is"+rate*2*width*length);

        }
    }
}

public class MemberInsideClass {

    public static void main(String[] args) {
        Outer obj = new Outer (40, 20); 
        obj.displayOuter();// accessing the method  
        System.out.println ("Area of Obj = " + obj.area());  
        
    }
    
}

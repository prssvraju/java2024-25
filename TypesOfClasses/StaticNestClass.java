import java.io.*;
class Outer
{
    private static int width;
    private static int length;
    Outer(int w,int h)
    {
        width=w;
        length=h;
    }
    public int area()
    {
        return width*length;
    }
    static class Inner
    {
        private int rate;
        Inner(int r)
        {
            rate=r;
        }
        public void displayInner()
        {
            System.out.println("Fencing Cost is"+rate*2*width*length);

        }
    }
}
public class StaticNestClass {
    
    public static void main(String[] args) {
        Outer out =new Outer(20, 40);
        Outer.Inner inner = new Outer.Inner(10);
        System.out.println("Area "+out.area());
        inner.displayInner();

    }
}

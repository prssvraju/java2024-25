import java.io.*;
class Shape
{
    int radius;
    int length,be,s;
    public int area(int l,int b)
    {
        return l*b;
    }
    public double area(int r)
    {
        return 3.14*r*r;
    }
}    
class MyCode
{
    public static void main(String[] args) {
        
        Shape circle=new Shape();
        System.out.println("Area of circle is "+circle.area(20));
    }

}
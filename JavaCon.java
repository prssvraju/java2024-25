import java.io.*;
import java.util.Scanner;
class JavaCon
{
    public static void main(String[] args) {
        final double PI=3.1414;
        int r=0;

        System.out.println("Ente radius");
        Scanner sc = new Scanner(System.in);
        r= sc.nextInt();
        //
        
        //PI=PI+4;
        double area= PI*r*r;
        System.out.println("Area"+area);

    }
}
import java.io.*;
public class ReadingFile {
    public static void main(String[] args)throws IOException {
        FileInputStream fi =new FileInputStream("raghu.txt");
        int n=0;
        n=fi.read();
        while(n!=-1)
        {
            System.out.println((char)n);
            n=fi.read();
        }
        fi.close();
    }
    
}

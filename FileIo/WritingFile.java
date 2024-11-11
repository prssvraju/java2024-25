import java.io.FileOutputStream;
import java.io.IOException;

class WritingFile
{
    public static void main( String args[])throws IOException
    {
        FileOutputStream fo = new FileOutputStream("raghu.txt");
        String data ="hello";
        byte info[] = data.getBytes();
        fo.write(info);
        fo.close();
    }
}

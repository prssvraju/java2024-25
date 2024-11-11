import java.io.File;

class FileEx
{
    public static void main(String args[])
    {
        File f = new File("prog.txt");
        try
        {
            if(f.createNewFile())
            {
                System.out.println("File created"+f.getName());
            }
            else
            {
                System.out.println("File already exists");

            }
            if(f.exists())
            {
                System.out.println("File path"+f.getAbsolutePath());
                System.out.println("Is readable: " + f.canRead()); 
                System.out.println("Is writable: " + f.canWrite());
            }
            if(f.delete())
            {
                System.out.println("File deleted successfully."); 
            } else {
                    
                System.out.println("Failed to delete the file.");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        

    }
}
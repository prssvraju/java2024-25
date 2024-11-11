// Java program to demonstrate OutputStream 
import java.io.*; 
class OutputStreamExample { 
	public static void main(String args[]) throws Exception 
	{ 
		OutputStream output 
			= new FileOutputStream("file.txt"); 
		byte b[] = { 65, 66, 67, 68, 69, 70 }; 
		// illustrating write(byte[] b) method 
		output.write(b); 
		// illustrating flush() method 
		output.flush(); 
		// illustrating write(int b) method 
		for (int i = 71; i < 75; i++) { 
			output.write(i); 
		} 
		output.flush(); 
		// close the stream 
		output.close(); 
	} 
}

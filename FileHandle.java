package core_javaS8;
import java.io.*;
public class FileHandle {

	public static void main(String[] args) throws IOException {
		
		int my_data;
	
		FileInputStream b1 =new FileInputStream("D:\\SourceFile.txt"); // object for source file
		FileOutputStream c1=new FileOutputStream("D:\\testFile1.txt");// object for target file
		
		while((my_data=b1.read())!=-1)	// read from file until end of data
		{
			System.out.print((char)my_data);	// show on console
			c1.write((byte)(my_data));// write to target file
		}
		b1.close();		// close open files
		c1.close();
		
		
		
	}

}

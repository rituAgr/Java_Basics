package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHanding 
{
	public static void main(String args[])throws Exception
	{
		FileInputStream f= new FileInputStream("Test.txt");
		FileOutputStream fout = new FileOutputStream("abcd.txt");
		int i=0;
		while((i=f.read())!=-1)
			fout.write(i);
			//System.out.print((char)i);
		f.close();
		fout.close();
	}

}

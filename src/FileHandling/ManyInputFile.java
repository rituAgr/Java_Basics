package FileHandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
public class ManyInputFile {
	public static void main(String args[]) throws Exception
	{
		FileInputStream fin1=new FileInputStream("Test1.txt");
		FileInputStream fin2=new FileInputStream("Test2.txt");
		FileOutputStream fout = new FileOutputStream("Test3.txt");
		SequenceInputStream sis = new SequenceInputStream(fin1,fin2);
		int i=0;
		while((i=sis.read())!=-1)
			fout.write(i);
		fin1.close();
		fin2.close();
		fout.close();
	}

}

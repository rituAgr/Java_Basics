package FileHandling;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class outputManyfiles {
	public static void main(String args[])throws Exception
	{
		FileInputStream fin = new FileInputStream("abcd.txt");
		FileOutputStream fout1 = new FileOutputStream("result1");
		FileOutputStream fout2 = new FileOutputStream("result2");
		int i=0;
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		while((i=fin.read())!=-1)
		{
			bout.write(i);
			
		}
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.flush();
		fin.close();
		fout1.close();
		fout2.close();
	}
}

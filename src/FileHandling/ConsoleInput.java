package FileHandling;
import java.io.*;  
public class ConsoleInput {
	public static void main(String args[])throws Exception 
	{  
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);  
	  
	System.out.println("Enter your name");  
	String name=br.readLine();  
	System.out.println("Welcome "+name);  
	
	//Another shortcut way to take input, BUT IT IS NOT WORKING
	
	/*Console c =System.console();
	System.out.println("Enter your name: ");
	String text=c.readLine();  
	System.out.println("Text is: "+text);  */
	 }  
	}  



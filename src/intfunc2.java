import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class intfunc2 {
	public static long gcd (long m, long n)   //  Greatest common divisor
	{
		return  (m % n) == 0 ? n : gcd(n, m%n);
	}

	public static long lcm (long m, long n)   //  Least common multiple      
	{
		return  m * n / gcd(m, n);
	}

	// ----------------------------

	//  Test driver for gcd and lcm

	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new FileReader("src/TestCases.txt"));
		String test=input.readLine();
		boolean check=false;
		String testFail=null;
		while(check==false&&test!=null)
		{
			String value=input.readLine();
			String result=input.readLine();
			String values[]=(value.trim()).split(" ");
			String results[]=(result.trim()).split(" ");
			if(values.length!=2||results.length!=2)
			{
				check=true;
				testFail=test;
			}
			long j = GetLong (values[0]);
			long k = GetLong (values[1]);
			long res1= gcd (j, k);
			long res2=lcm (j, k);
			if(res1!=GetLong(results[0])||res2!=GetLong(results[1]))
			{
				check=true;
				testFail=test;
			}
			input.readLine();
			test=input.readLine();
		}
		if(check==false)
			System.out.println("All test cases passed");
		else
			System.out.println(testFail+" Failed");
		input.close();
	}

	public static long GetLong(String s)
	{
		return Long.parseLong(s);
	}

}

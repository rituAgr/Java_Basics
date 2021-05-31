import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class intfunc {
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
		Scanner scan=new Scanner(System.in);
		File file = new File("Test_Results.txt");
		BufferedWriter output=new BufferedWriter(new FileWriter(file));;
		char repeat='y';
		int num=1;
		while(repeat=='y'||repeat=='Y')
		{
			System.out.println("Enter the count of numbers you want to enter ");
			int count=scan.nextInt();
			if (count == 2) {
				System.out.println("Enter numbers in different lines ");
				long j = GetLong (scan.next());
				long k = GetLong (scan.next());
				String res1="The greatest common divisor of " + j + " and " + k + " is " + gcd (j, k);
				String res2="Their least common multiple is " + lcm (j, k);
				System.out.println(res1);
				System.out.println(res2); 
				try{
				output.write("\n******* Test "+num+" *******\n"+res1+"\n");
				output.write(res2+"\n ");				
				}
				catch(IOException e ){}
				num++;
			}
			else 
				System.out.println("Parameters not specified");
			System.out.println("Do you want to do another test (y/n)");
			repeat=scan.next().charAt(0);
			
		}
		output.close();
		System.out.println("Testing closed. No more test can be done");
		scan.close();
	}

	public static long GetLong(String s)
	{
		return Long.parseLong(s);
	}

}
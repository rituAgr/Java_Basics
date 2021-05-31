package ListOfList;
import java.util.Arrays;
public class Array_of_Arrays {
	public static void main(String args[])
	{
		int count=0;
		int array[][]=new int[5][];
		for(int i=0;i<array.length;i++)
		{
			array[i]=new int[++count];
			Arrays.fill(array[i], 3);
			System.out.println(Arrays.toString(array[i]));
		}
		//System.out.println(Arrays.toString(array));
	}

}

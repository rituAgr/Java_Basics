package OOPs_concept;
import java.awt.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class buffer {

	public static void main(String[] args) 
	{
		//Integer[] values = {1967513926, 1540383426, -1303455736, -521595368 };
		ArrayList<ArrayList<Integer>> Xim = new ArrayList<ArrayList<Integer>>();
		Xim=generate(5);
		System.out.println(Xim.toString());
	    }
	public static ArrayList<ArrayList<Integer>> generate(int a) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    for(int i=0;i<a;i++)
	    	result.add(new ArrayList<Integer>());
	    ArrayList<Integer> prev_row=new ArrayList<Integer>();
	    ArrayList<Integer> row=new ArrayList<Integer>();
	    for(int i=1;i<=a;i++)
	    {
	        row=result.get(i-1);
	        for(int j=0;j<i;j++)
	        {
	            if(j==0)
	            row.add(1);
	            else if(j==prev_row.size())
	            row.add(1);
	            else
	            row.add(prev_row.get(j)+prev_row.get(j-1));
	        }
	        prev_row.clear();
	        prev_row.addAll(row);
	        //result.add(prev_row);
	        //row.clear();
	    }
	    return result;
	}
	}
	

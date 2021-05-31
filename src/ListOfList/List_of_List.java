package ListOfList;
import java.util.ArrayList;
public class List_of_List {
	public static void main(String args[])
	{int count=2;
	ArrayList<ArrayList<Integer>> ListOfList=new ArrayList<ArrayList<Integer>>();
	/*we need below two lines else the arraylist will be empty and will not enter loop.
	Its different from array because as we declare the array of that size get automatically filled up will 0(default value) */
	for(int i=0;i<5;i++)
		ListOfList.add(new ArrayList<Integer>());
	for(ArrayList<Integer> l : ListOfList)
	{
		int j=0;
		while(j<count)
			{
			l.add(j);
			System.out.print(l.get(j)+" ");
			j++;
			}count++;
		System.out.println();
	}
	}

}

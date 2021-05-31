package ListOfList;

import java.util.ArrayList;

public class Card_Game {
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>> cards= new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<4;i++)
			cards.add(new ArrayList<Integer>());
		for(int i=0;i<4;i++)
		{
			int count=0;
			int j=(int)(Math.random()*13);
			while(count<j)
			{
				(cards.get(i)).add(count);
				count++;
			}
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(cards.get(i).toString());
		}
	}
}



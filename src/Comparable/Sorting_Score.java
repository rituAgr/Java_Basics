package Comparable;
import java.util.ArrayList;
import java.util.Collections;
public class Sorting_Score 
{
	public static void main(String args[])
	{
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student("Susan","A",122));
		list.add(new Student("Alex","B-",122));
		list.add(new Student("Haile","A",125));
		list.add(new Student("Mike","A+",130));
		list.add(new Student("Kevin","B+",122));
		list.add(new Student("Peter","A+",125));
		list.add(new Student("Roger","B",122));
		Collections.sort(list);
		for(Student s : list)
			System.out.println(s.Name+"\t"+s.credit_hours+"\t"+s.grade);
	}
}
class Student implements Comparable<Student>{
	String Name;
	String grade;
	int credit_hours;
	Student(String Name,String grade,int credit_hours)
	{
		this.Name=Name;
		this.grade=grade;
		this.credit_hours=credit_hours;
	}
	public int compareTo(Student s2)
	{
		int c1=this.credit_hours;
		int c2=s2.credit_hours;
		if(c1==c2)
		{
			String g1=(this.grade).toUpperCase();
			String g2=(s2.grade).toUpperCase();
			int i;
			int l=(g1.length()<g2.length()?g1.length():g2.length());
			for(i=0;i<l;i++)
			{
				if(g1.charAt(i)<g2.charAt(i))
					return -1;
				if(g1.charAt(i)>g2.charAt(i))
					return +1;
				if(g1.charAt(i)==g2.charAt(i))
				{
					if(g1.length()>g2.length())
					{

						if(g1.charAt(i+1)=='-')
							return 1;
						if(g1.charAt(i+1)=='+')
							return -1;
					}
					else if(g1.length()<g2.length())
					{
						if(g2.charAt(i+1)=='+')
							return +1;
						if(g2.charAt(i+1)=='-')
							return -1;
					}
				}
			}
			return 0;
		}
		if(c1>c2)
			return -1;
		else
			return 1;
	}
}

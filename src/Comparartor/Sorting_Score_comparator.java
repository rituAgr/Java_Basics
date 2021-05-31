package Comparartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Sorting_Score_comparator implements Comparator<Student>
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
		Collections.sort(list, new Sorting_Score_comparator());//Here the object is of class which has compare function
		for(Student s : list)
			System.out.println(s.getName()+"\t"+s.getCredit_hours()+"\t"+s.getGrade());
	}
	public int compare(Student s1, Student s2)
	{
		int c1=s1.getCredit_hours();
		int c2=s2.getCredit_hours();
		if(c1==c2)
		{
			String g1=(s1.getGrade()).toUpperCase();
			String g2=(s2.getGrade()).toUpperCase();
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

class Student 
{
	String Name;
	String grade;
	int credit_hours;
	Student(){};
	Student(String Name,String grade,int credit_hours)
	{
		this.Name=Name;
		this.grade=grade;
		this.credit_hours=credit_hours;
	}
	public void setName(String name)
	{
		Name=name;
	}
	public String getName()
	{
		return Name;
	}
	public void setGrade(String grade)
	{
		this.grade=grade;
	}
	public String getGrade()
	{
		return grade;
	}
	public void setCredit_hours(int credit_hours)
	{
		this.credit_hours=credit_hours;
	}
	public int getCredit_hours()
	{
		return credit_hours;
	}
	
}

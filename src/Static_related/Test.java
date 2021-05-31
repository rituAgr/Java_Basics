package Static_related;

public class Test 
{
	//Static member variable belongs to class not to object.
	//So, all objects share same value of static variable
	static int i=10;
	// In static block we can access static variables and functions.
	static {
		System.out.println("Inside static block");
		System.out.println("called double func "+add(5,10));
	}
	static int add(int x, int y)
	{
		return x+y;
	}
	//In java only nested inner class can be static not the outer one.
	static class inner_Class{
		inner_Class()
		{
			System.out.println("Inside inner class");
		}
	}
	
}

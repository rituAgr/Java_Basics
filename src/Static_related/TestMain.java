package Static_related;

public class TestMain {

	public static void main(String args[])
	{
	System.out.println("Inside main function\nAccessing the static class variables and functions");	
	System.out.println("The value of i variable is "+Test.i);
	System.out.println("The value ofadding 5 and 15 "+Test.add(5,15));
	//The way to create the object of inner static nested class
	//className object = new className();
	Test.inner_Class ob = new Test.inner_Class();
	//The below mentioned feature is introduced in java 8
	MyInterface.foo();
	
	}

}

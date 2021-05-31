package OOPs_concept;
/* Annonymous simply means nameless.An object that have no reference is known 
  as annonymous object.If you have to use an object only once, annonymous 
  object is a good approach.*/
public class Annonymous_object {
	void calculate(int z)
	{
		System.out.println(z);
	}
	public static void main(String[] args)
	{
		new Annonymous_object().calculate(5111);
	}

}

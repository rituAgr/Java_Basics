package aggregation;

public class couple {
	void duty()
	{
		System.out.println("Earning");
		result();
	}
	void result()
	{
		System.out.println("LAdies are AWESOME!!!");
	}
	public static void main(String []args)
	{
		System.out.println("Ladies are got soo much to do");
		System.out.println("I can prove it \n\n");
		couple c = new couple();
		wife w = new wife();
		Husband h = new Husband();
		System.out.println("LADIES HAVE TO---");
		c.duty();
		w.duty();
		System.out.println("\n Men HAVE TO---");
		c.duty();
		h.duty();
		
	}

}

package enums;

public class enum_demonstration {
	public static void main(String args[])
	{
		/*ChineseMenu item=ChineseMenu.Soup_veg;
		System.out.println("The price of "+item+" is "+item.getPrice(item));*/
		System.out.println(" The menu ");
		ChineseMenu menu[]=ChineseMenu.values();
		for(ChineseMenu each_item : menu)
			System.out.println(each_item+" : The Price is "+each_item.getPrice(each_item)+" The Oridinal is "+each_item.ordinal());
	}

}
enum ChineseMenu
{
	Soup_chicken(705),Soup_veg(50), Noodle_chicken(100), Noodle_veg(75), Rice_chicken(90), Rice_veg(70);
	// All these all constant names in enums are static and final but the values are not
	int price;
	private ChineseMenu(int price)
	{
		this.price=price;
	}
	int getPrice(ChineseMenu item)
	{
		return item.price;
	}
}

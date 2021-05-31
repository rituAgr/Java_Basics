package enums;

public class enum_cards {
	public static void main(String args[])
	{
		faceValue f=faceValue.five;
		suite s=suite.Diamonds;
		System.out.println("the face value is "+f.getValue(f)+" "+s.getSign(s));
		
	}
}

enum faceValue
{
  one(1),two(2),three(3),four(4), five(5);
	int  value;
	private faceValue(int  value)
	{
		this.value=value;
	}
	 int getValue(faceValue f)
	{
		return f.value;
	}
}
enum suite
{
	Hearts("Hearts"),Diamonds("dia"),clubs("clb"),spade("sp");
	String sign;
	private suite(String sign)
	{
		this.sign=sign;
	}
	String getSign(suite s)
	{
		return s.sign;
	}
}

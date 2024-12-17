abstract class Vip
{
	abstract void YellowRed();
}
class Colors extends Vip
{
	public static void main (String ar[])
	{
		Colors c=new Colors();
		c.YellowRed();
	}
	@Override
	void YellowRed()
	{		
		System.out.println("YellowRed");
	}
}
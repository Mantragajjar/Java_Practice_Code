class a
{
	sum(int x,int y)
	{
		System.out.println((x+y));
	}
}
class b 
{
	sum(int x,int y)
	{
		System.out.println("the sum is : "+(x+y));
	}
}
class ConstructorOverriding
{
	public static void main(String ar[])
	{
		a B=new b(10,20);
	}
}
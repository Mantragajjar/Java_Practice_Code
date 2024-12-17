class MethodOverloading
{
	void sum (int a,int b)
	{
		System.out.println((a+b));
	}
	void sum(int x,int y,int z)
	{
		System.out.println((x+y+z));
	}
	public static void main(String ar[])
	{
		MethodOverloading m =new MethodOverloading();
		m.sum(10,20);
		m.sum(10,20,30);
	}
}
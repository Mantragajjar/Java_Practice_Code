class ParameterizedConstructor
{
	ParameterizedConstructor(int x,int y)
	{
		System.out.println("I am Parameterized Constructor");
		System.out.println("x is : "+x);
		System.out.println("y is : "+y);
	}
	public static void main (String ar[])
	{
		ParameterizedConstructor p =new ParameterizedConstructor(10,20);
	}
}
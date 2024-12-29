class MaxMin
{
	public static void main(String ar[])
	{
		int a=30;
		int b=20;
		int c=10;
		if(b>a)
		{
			if(b>c)
			{
				System.out.println("b is the greatest");
			}
			else
			{
				System.out.println("c is the greatest");
			}	
		}
		else//a is smaller than b
		{
			if(a>c)
			{
				System.out.println("a is the greatest");
			}
			else
			{
				System.out.println("c is the greatest");
			}
		}
	}
}

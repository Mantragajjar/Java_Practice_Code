class one
{
	int a=10;
	int b=20;
	void data()
	{
		System.out.println("data method call");
	}
}	
class two extends one
{
	void display()
	{
		System.out.println(a+b);
	}
}
class Single_Inheritance
{
	public static void main(String args[])
	{
		two t=new two();
		t.display();
		t.data();
	}
}
class input
{
	int a=10;
	int b=20;
	int c=30;

}
class sum extends input
{
	void add()
	{
		System.out.println(a+b+c);
	}
}
class sub extends input
{
	void subtraction()
	{
		System.out.println(a-b-c);
	}
}
class mul extends input
{
	void multi()
	{
		System.out.println(a*b*c);
	}
}
class Single_Inheritance_Maths
{
	public static void main(String args[])
	{
		sum s=new sum();
		s.add();
		sub x=new sub();
		x.subtraction();
		mul m=new mul();
		m.multi();
	}
}










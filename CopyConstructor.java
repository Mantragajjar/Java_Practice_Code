class CopyConstructor
{
	int age;
	String Name;
	
	CopyConstructor(int age,String Name)
	{
		this.age=age;
		this.Name=Name;
		
	}
	CopyConstructor(CopyConstructor c)
	{
		age=c.age;
		Name=c.Name;
		
	}
	void Display()
	{
		System.out.println(age +" "+ Name);
	}
	public static void main (String ar[])
	{
		CopyConstructor c1 = new CopyConstructor(10,"Mantra");
		CopyConstructor c2 = new CopyConstructor(c1);
		c1.Display();
		c2.Display();
		
	}
}
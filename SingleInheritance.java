class animal
{
	void legs()
	{
		System.out.println("dogs and cats");
	}
}
class dogs extends animal
{	
	void barks()
	{
		System.out.println("bark");
	}
}
class SingleInheritance
{
	public static void main (String ar[])
	{
		dogs d = new dogs();
		d.barks();
		d.legs();
	}
}
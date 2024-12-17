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
class cats extends dogs
{
	void meow()
	{
		System.out.println("meow");
	}
}
class MultilevelInheritance
{
	public static void main (String ar[])
	{
		cats a=new cats();
		a.legs();
		a.barks();
		a.meow();
	}
}

class Animal
{
	void sound()
	{
		System.out.println("Animal make sound");
	}
}
class Dog extends Animal 
{
	void sound()
	{
		System.out.println("Dog make sound");
	}
}
class MethodOverRiding
{
	public static void main(String ar[])
	{
		Animal d=new Dog();
		d.sound();
		d.sound();
	}
}
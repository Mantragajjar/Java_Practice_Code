class PersonalInfo
{
	private int age;
	private String name;
	
	public PersonalInfo(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	
	public void DisplayInfo()
	{
		System.out.println("Name is :"+this.name);
		System.out.println("Age is :"+this.age);
	}
}
class ThisKeyword
{
	public static void main(String ar[])
	{
		PersonalInfo t1 = new PersonalInfo("mantra",30);
		PersonalInfo t2 = new PersonalInfo("Duke",54);
		t1.DisplayInfo();
		t2.DisplayInfo();
	}
}
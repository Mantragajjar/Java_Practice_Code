import java.util.Scanner;
class SwitchCase
{
	public static void main (String ar[])
	{
		System.out.println("mantra1 for english");
		System.out.println("mantra2 for hindi");
		System.out.println("mantra3 for gujrati");
		Scanner sc=new Scanner(System.in);
		String choice;
		System.out.println("enter your choice");
		choice = sc.nextLine();
		switch(choice)
		{
			case "mantra1":
				System.out.println("english");
				break;
			
			case "mantra2":
				System.out.println("hindi");
				break;
				
			case "mantra3":
				System.out.println("gujrati");
				break;
			
			default:
				System.out.println("invalid");
		}
	}
}
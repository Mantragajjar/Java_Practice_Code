import java.util.Scanner;
class Login
{
	public static void main(String ar[])
	{
		String username="admin",password="1234";
		String enteru,enterp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username:");
		enteru=sc.nextLine();
		System.out.println("enter password:");
		enterp=sc.nextLine();
		System.out.println(enteru);
		if(username.equals(enteru))
		{
			if(password.equals(enterp))
			{
				System.out.println("login successfully");
			}
			else
			{
				System.out.println("password incorrect");
			}
		}
		else
		{
			System.out.println("username is incorrect");
		}
	}
}

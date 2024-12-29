import java.util.Scanner;
class Prime_Number
{
	public static void main(String args[])
	{
		int prime=0,j=0,output,a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number:");
		prime=sc.nextInt();
		for(j=2;j<=prime-1;j++)
		{
			if(prime%j==0)
			{
				a=1;
				break;
			}
		}
			if(prime==1) 
            {
				System.out.println("the number is not prime");
			}
			else if (a==0)
            {
				System.out.println("it is a prime");
			}
			else
 			{
				System.out.println("it is notprime");
			}			
	}
}	

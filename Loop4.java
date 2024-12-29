import java.util.Scanner;
class Loop4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Enter value of starting");
		i=sc.nextInt();
		System.out.println("Enter value of ending");
		j=sc.nextInt();
		if(i>2000 && j<2500)
		{
			for(int x=i;x<j;x++)
			{
				if(x%4==0)
				{
					System.out.println(x);	
				}
			}
		}
		else
		{
			System.out.println("value is not applicable");
		}	
	}
}

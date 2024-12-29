import java.util.*;
class Loop2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int sum=0;
		for(i=0;i<=100;i++)
		{
			if(i%2==0)
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println(sum);
	}
}

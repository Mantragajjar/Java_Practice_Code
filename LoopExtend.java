import java.util.Scanner;
class LoopExtend
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice for rounds:");
		a=sc.nextInt();
		int pre=1;
		int temp=1;
		int i;
		for(i=0;i==a;i++)
		{
			int next=pre+temp;
			System.out.println(next);
			pre=temp;
			temp=next;
		}
	}
}
 // 1 2 3 5 8 13

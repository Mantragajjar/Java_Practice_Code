class A extends Thread
{
	public void run()
	{
		for (int i=0;i<=100;i++)
		{
			System.out.println("Hello");
			try
			{
			Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				System.out.println();
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for (int i=0;i<=100;i++)
		{
			System.out.println("Good Morning");
			try
			{
			Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				System.out.println();
			}
		}
	}
}
class ThreadDemo
{
	public static void main (String ar[])
	{
		A a=new A();
		B b=new B();
		
		a.start();
		b.start();
	}
}
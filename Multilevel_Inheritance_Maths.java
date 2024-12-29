import java.util.Scanner;
	
class sum
{
	void sumation(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
}
class sub extends sum
{
	void subtraction(int a, int b, int c)
	{
		System.out.println(a-b-c);
	}
}
class mul extends sub
{
	void multi(int a, int b, int c)
	{
		System.out.println(a*b*c);
	}
}
class Multilevel_Inheritance_Maths
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");            
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();   
                    
		
		mul m = new mul();
		m.sumation(a,b,c);
        
		m.subtraction(a,b,c);
		m.multi(a,b,c);
	}
	
}

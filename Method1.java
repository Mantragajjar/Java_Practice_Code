class Method1 
{
    void sum()
    {
        int a = 10;
        int b = 20;
        System.out.println("sum is :"+ (a+b));
    }
}
class Method2 extends Method1
{
    public static void main(String ar[])
    {
        Method1 m =new Method1();
        m.sum();
    }
}

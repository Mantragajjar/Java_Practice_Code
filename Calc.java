import java.lang.*;
import java.util.Scanner;
 
public class Calc 
{
    public static void main(String args[])
    {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
 
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
 
        System.out.println("Enter the operator (+,-,*,/):");
 
        char op = sc.next().charAt(0);
        double o = 0;
 
        switch (op) 
        {
            // case to add two numbers
            case '+':
                o = num1 + num2;
                break;
    
            // case to subtract two numbers
            case '-':
                o = num1 - num2;
                break;
    
            // case to multiply two numbers
            case '*':
                o = num1 * num2;
                break;
    
            // case to divide two numbers
            case '/':
                o = num1 / num2;
                break;
    
            default:
                System.out.println("You enter wrong input");
        }
        System.out.println("The final result:");
        System.out.println();
 
        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                           + " = " + o);
    }
}
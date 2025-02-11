import java.util.Scanner;

public class inetaddress {
    public static void main (String ar[])
    {
        Scanner sc = new Scanner(System.in);

        //get the IP Address from the user
        System.out.println("Enter the IP Address:");
        String ipAddress = sc.nextLine();

        // split the IP address into parts
        String[] parts = ipAddress.split("\\.");

        // check if it has 4 parts
        if(parts.length!=4)
        {
            System.out.println("Invalid IP Address format!");
            return;
        }

        try
        {
            // get the first part of the IP Address as a number
            int firstpart=Integer.parseInt(parts[0]);

            // check the range of the first part to determine the class
            if(firstpart>=0 && firstpart<=127)
            {
                System.out.println("The IP Address is a Class A");
            }
            else if(firstpart>=128 && firstpart<=191)
            {
                System.out.println("The IP Address is a Class B");
            }
            else if(firstpart>=192 && firstpart<=223)
            {
                System.out.println("The IP Address is a Class C");
            }
            else if(firstpart>=224 && firstpart<=239)
            {
                System.out.println("The IP Address is a Class D");
            }
            else
            {
                System.out.println("Invalid IP Address range");
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid IP Address!Make sure IP Address only contains numbers");
        }

        sc.close();
    }
}
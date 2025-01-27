import java.io.*;
import java.net.*;
import java.util.*;

public class Client_hello 
{
    public static void main(String[] args) 
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            String str;
            System.out.println("Enter your message to send to server");
            str = sc.nextLine();
            //connet to the server or localhost port 1234
           
                Socket socket = new Socket ("localhost",1234);
                System.out.println("Connected to the server");
                OutputStream output =socket.getOutputStream();
                PrintWriter writer= new PrintWriter(output , true);
                writer.println(str);
                // close the connection
                socket.close();
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }    
    }    
}

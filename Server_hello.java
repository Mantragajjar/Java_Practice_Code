import java.io.*;
import java.net.*;

public class Server_hello 
{
    public static void main(String[] args) 
    {
        try
        {
            //creat server socket on port 1234
            ServerSocket serversocket = new ServerSocket (1234);
            System.out.println("server is listening on port 1234");
            // wait for client to connect 
            System.out.println("client connected");
            Socket socket = serversocket.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = reader.readLine();
            System.out.println("client says : "+ message);
            //close the connection
            socket.close();
            serversocket.close();
        }    
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }    
}

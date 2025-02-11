import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
    public static void main (String ar[])
    {
        try
        {
            // creat a server socket on port 1234
            ServerSocket serversocket = new ServerSocket(1234);
            System.out.println("server is listening on port 1234");
            //wait for a client to connect
            Socket socket = serversocket.accept();
            System.out.println("client connected");
            socket.close();
            serversocket.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }    
}

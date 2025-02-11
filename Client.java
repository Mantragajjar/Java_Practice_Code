import java.net.Socket;

public class Client 
{
    public static void main (String ar[])
    {
        try
        {
            //connect to the server on localhost,port 1234
            Socket socket = new Socket("loaclhost",1234);
            System.out.println("Connetcted to the server");
            socket.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

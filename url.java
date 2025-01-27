import java.net.URL;

public class url
{
    public static void main(String[] args) 
    {
        try 
        {
            URL url = new URL("https://developer.mozilla.org/en-US/docs/Learn_web_development/Howto/Web_mechanics/What_is_a_URL");

            //display URL component
            System.out.println("Protocol : "+ url.getProtocol());
            System.out.println("Host : "+ url.getHost());
            System.out.println("Port : "+ url.getPort());
            System.out.println("Path : "+ url.getPath());
            System.out.println("Query : "+ url.getQuery());
            System.out.println("file : "+ url.getFile());
            System.out.println("Ref(anchor) : "+ url.getRef());
        }
        catch (Exception e)
        {
            System.out.println("Malformed URL : "+e.getMessage());
        }
    }
}

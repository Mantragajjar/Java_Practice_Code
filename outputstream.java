
import java.io.FileOutputStream;
import java.io.IOException;

public class outputstream {
    public static void main (String ar[])
    {
        String filepath = "outputstream.txt";//replace with your file path
        String content = "Hello, World!This side Mantra"; // replace with your content
        
        try(FileOutputStream fileoutputstream = new FileOutputStream(filepath))
        {
            //convert the string content to byte
            byte[] contentBytes = content.getBytes();
            //write the bytes to the file
            fileoutputstream.write(contentBytes);
            System.out.println("File written successfully!");
        }
        catch(IOException e)
        {
            System.out.println("An Error occured while writing to the file.");
        }
    }
}

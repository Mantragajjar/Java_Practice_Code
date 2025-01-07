import java.io.*;

public class BuffReader {
    public static void main (String ar[])
    {
        String FilePath="BuffReader.txt";//replace with your file name
        
        try(BufferedReader Reader = new BufferedReader(new FileReader(FilePath)))
        {
            String Line;
            if((Line=Reader.readLine())!=null)
            {
                System.out.println(Line);
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occured while reading the file");
        }
    }
}

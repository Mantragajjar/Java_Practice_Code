import java.io.*;
public class Inputstream {
    public static void main (String ar[])
    {
        String filepath = "inputstream.txt";//replace with your file name

        try(FileInputStream fileInputStream = new FileInputStream(filepath))
        {
            int content;
            while ((content = fileInputStream.read()) != -1) 
            {
                //convert the byte to a character and print
                System.out.print((char)content); 
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occured while reading the file.");
        }
    }
}
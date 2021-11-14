import java.io.*;

public class CheckFile {
    public static void main(String[] args) {
        try(FileReader reader = new
                FileReader("C:\\work\\LabaText.txt"))
        {
            // читаемпосимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}


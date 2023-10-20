package InOut;
import java.io.*;
public class FileReaderDemo {
    public static void main(String[] args) {

        try (var fr = new       FileReader ("src/InOut/FileReaderDemo.java"))
         //                    FileReader ("testwriter.txt"))
        {	int c;

            while ((c=fr.read())!=-1)

                System.out.print ((char) c);

        }catch (IOException e) {
            System.out.println ("Ошибка при чтении");

        }



    }
}

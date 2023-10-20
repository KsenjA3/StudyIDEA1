package InOut;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileWriterDemo {
    public static void main(String[] args) {
        String sR= "Русский";
        String sE= "EnglisH";
        double d=123.456;
        int i=312;
        boolean b=true;

        try (var out = new PrintWriter ("testwriter.txt", StandardCharsets.UTF_8))
        {	out.write(sR);
            out.write("\n");
            out.write(sE);
            out.write("\n");
            out.write(i);
            out.write("\n");

            out.println(sR);
            out.println(sE);
            out.println(d);
            out.println(i);
            out.println(b);

        }catch (IOException e) {
            System.out.println ("Ошибка при записи");

        }



    }
}

package InOut;

import java.nio.file.*;
import java.io.*;

public class ShowFile {
    public static void main (String [] args)  {
        int i;

        if (args.length!=1) {
            System.out.println("введи путь к файлу");
            return;
        }
        try (InputStream fin = Files.newInputStream(Paths.get(args[0])))
        {
            do {
                i=fin.read();
                if (i!=-1) System.out.print((char) i);
            } while (i!=-1);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути" + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }



    }
}

package InOut;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOstreamWrite {
    public static void main(String[] args) throws IOException {
        int inFile;
        try (OutputStream fout = new BufferedOutputStream(
                Files.newOutputStream(Paths.get("nioOut.txt"))))
        {
            do {
                var bufIn = new BufferedReader( new InputStreamReader(System.in, "windows-1251"));
                inFile = bufIn.read();
                System.out.println("Введено: " + inFile);

                fout.write(inFile);
                fout.write(20);

            }while (inFile!=115);

            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка при записи");
        }


    }

}

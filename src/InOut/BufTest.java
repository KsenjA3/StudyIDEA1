package InOut;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufTest {
    public static void main(String[] args) throws IOException{
        String inFile;

        try (var bufOut = new BufferedWriter (new OutputStreamWriter
                        (new FileOutputStream("testbuf.txt"), StandardCharsets.UTF_8))) {
            do {
                var bufIn = new BufferedReader( new InputStreamReader(System.in, StandardCharsets.UTF_8));
                inFile = bufIn.readLine();
                System.out.println("Введено: " + inFile);
            bufOut.write(inFile+"\n");

            }while (!inFile.equals("стоп"));

            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка при записи");
        }

    }
}

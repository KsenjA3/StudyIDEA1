package InOut;

import java.io.*;

public class BufTestChar {
    public static void main(String[] args) throws IOException {
        int inFile;

        try (var bufOut = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream("testbufChar.txt")))) {
            do {
                var bufIn = new BufferedReader( new InputStreamReader(System.in));
                inFile = bufIn.read();
                System.out.println("Введено: " + inFile);
                bufOut.write(inFile);
                bufOut.write(10);

            }while (inFile!=115);

            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка при записи");
        }
}}

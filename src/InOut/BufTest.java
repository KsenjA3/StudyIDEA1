package InOut;

import java.io.*;


public class BufTest {
    public static void main(String[] args) throws IOException{
        String inFile;

        try (var bufOut = new BufferedWriter (new OutputStreamWriter
                        (new FileOutputStream("testbuf.txt"),"UTF-8" ))) {
            do {
                var bufIn = new BufferedReader( new InputStreamReader(System.in, "UTF-8"));
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

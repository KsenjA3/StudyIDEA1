package InOut;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class StringReconstruction {

    private static final  String FILENAME = "pass.txt";
    private static final  String ENCODIND_WIN1251 = "windows-1251";
    private static final  String ENCODIND_UTF8 = "UTF-8";

    public static void main (String [] args) throws IOException {
          var  br = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream (FILENAME),
                                ENCODIND_WIN1251)
        );
          String incorrect =br.readLine();
          br.close();
        System.out.println("Incorrect code: " + incorrect);

        String restored = new String(incorrect.getBytes(ENCODIND_WIN1251),
                                     ENCODIND_UTF8) ;
        System.out.println("Restored code: " + restored);

        br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream (FILENAME),
                        ENCODIND_UTF8)
        );
        String correct =br.readLine();
        br.close();
        System.out.println("Correct code: " + correct);
    }
}

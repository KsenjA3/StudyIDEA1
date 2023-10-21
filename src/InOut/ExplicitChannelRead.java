package InOut;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
//import java.nio.channels.*;
import java.nio.charset.Charset;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        System.out.println(Charset.defaultCharset().displayName());


        int count;

        try (var fChan = Files.newByteChannel(Paths.get("pass.txt"))) {
// выделить память под буфер
            var mBuf = ByteBuffer.allocate(128);

            do {
//читать данные из файла в буфер
                count = fChan.read(mBuf);
                if (count != -1) {
                    mBuf.rewind();
                    for (int i = 0; i < count; i++)
                        System.out.print((char) mBuf.get());
                }

            } while (count != -1);
            System.out.println("\n");

            mBuf.rewind();
            Charset cset =Charset.forName("UTF-8");
            CharBuffer cBuf = cset.decode(mBuf);
            System.out.println(cBuf);
            System.out.println("\n");

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути" + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }


    }
}

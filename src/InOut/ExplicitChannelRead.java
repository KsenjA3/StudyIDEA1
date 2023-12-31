package InOut;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        boolean b;

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
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути" + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }


    }
}

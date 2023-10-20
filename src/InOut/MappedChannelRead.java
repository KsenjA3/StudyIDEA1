package InOut;

import java.io.*;
//import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;

public class MappedChannelRead {

    public static void main(String[] args) {
        System.out.println("проверка консоли" );

        try (FileChannel fChan = (FileChannel)   Files.newByteChannel(Paths.get("pass.txt"))) {
        // получить размер файла
            long fSize = fChan.size();
        // отобразить файл в буфер
            var mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0,fSize);
        //читать данные из буфера
             for (int i = 0; i < fSize; i++)
                 System.out.print((char) mBuf.get());
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути" + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }


    }
}

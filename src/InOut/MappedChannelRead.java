package InOut;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class MappedChannelRead {

    public static void main(String[] args) {

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

package InOut;
import java.io.*;
public class DatTest {
    public static void main(String[] args) {
        String sR= "Русский";
        String sE= "EnglisH";
        int i=1001;
        double d = 10.2331;
        boolean b= true;
// не получается разобраться с кодировкой в файле кракозяблы
         try (var dataOut = new DataOutputStream (new  //  FileOutputStream ("testdat.txt")))
														PrintStream ("testdat.txt", "UTF-8")))
        {
            System.out.println ("Записано: "+i);
            dataOut.writeInt(i);
            System.out.println ("Записано: "+d);
            dataOut.writeDouble(d);
            System.out.println ("Записано: "+b);
            dataOut.writeBoolean(b);
            System.out.println ("Записано: "+sR);
            dataOut.writeUTF(sR);
            System.out.println ("Записано: "+sE);
            dataOut.writeUTF(sE);
            System.out.println ();
        }catch (IOException e) {
            System.out.println ("Ошибка при записи");
            return;
        }
        try ( var dataIn = new DataInputStream (new FileInputStream ("testdat.txt")))
        {
            System.out.println ("Прочитано: "+i);
            dataIn.readInt();
            System.out.println ("Прочитано: "+d);
            dataIn.readDouble();
            System.out.println ("Прочитано: "+b);
            dataIn.readBoolean();
            System.out.println ("Прочитано: "+sR);
            dataIn.readUTF();
            System.out.println ("Прочитано: "+sE);
            dataIn.readUTF();
        }catch (IOException e) {
            System.out.println ("Ошибка при чтении");

        }
    }



}

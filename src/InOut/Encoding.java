package InOut;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.*;
import java.nio.ByteBuffer.*;
import java.nio.CharBuffer.*;
import java.io.*;

public class Encoding {
    public static void main (String [] args) throws IOException {


        String str = "456 ghj абвгдеёжзиклмнопрстуфхцчшщьыъэюяАБВГДЕЁЖЗИКЛМНОПРСТУФХЦЧШЩЬЫЪЭЮЯ";

        Charset cset =Charset.forName("windows-1251");
        ByteBuffer buf = cset.encode(str);

        String strCode = buf.toString();
        System.out.println (strCode);

        byte [] byteCode =buf.array();
        for (int i=0; i<byteCode.length; i++)
        System.out.print ((char) byteCode[i]);
        System.out.println ("\n");

        ByteBuffer decodeBuf =ByteBuffer.wrap(byteCode);
        CharBuffer cBuf = cset.decode(decodeBuf);

        String strDecode = cBuf.toString();
        System.out.println (strDecode);
        byte [] byteDecode =buf.array();
        for (int i=0; i<byteDecode.length; i++)
            System.out.print ((char) byteDecode[i]);
        System.out.println ();
    }
}

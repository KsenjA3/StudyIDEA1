package InOut;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.*;

import java.io.*;

public class Encoding {
    public static void main (String [] args) throws IOException {

        int chi=0;
        String str = "456 ghj л";

        Charset cset =Charset.forName("windows-1251");


        ByteBuffer buf = cset.encode(str);

        String strCode = buf.toString();
        System.out.println (strCode);

        byte [] byteCode =buf.array();
        for (int i=0; i<byteCode.length; i++){
          if (byteCode[i]<0) chi= 1104 +byteCode[i];
          if (byteCode[i]>=0) chi= byteCode[i];
            System.out.println (chi+ " + " +(char) chi);
        }

        System.out.println ("\n");

        ByteBuffer decodeBuf =ByteBuffer.wrap(byteCode);
        CharBuffer cBuf = cset.decode(decodeBuf);

        String strDecode = cBuf.toString();
        System.out.println (strDecode);
        byte [] byteDecode =buf.array();

        for (int i=0; i<byteDecode.length; i++){
            if (byteDecode[i]<0) chi= 1104 +byteDecode[i];
            if (byteDecode[i]>=0) chi= byteDecode[i];
            System.out.print ((char) chi);
        }

        System.out.println ();
    }
}

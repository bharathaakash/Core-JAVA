import java.io.*; 
public class Bytearrayout {
    public static void main(String[] args) throws Exception{
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream(10);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        byte arr[] = bos.toByteArray();

        for(byte x:arr){
            System.out.print((char)x);
        }

        bos.writeTo(new FileOutputStream("byteout.txt"));

    }
}

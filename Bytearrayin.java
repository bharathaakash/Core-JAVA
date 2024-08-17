import java.io.*;

public class Bytearrayin {
    public static void main(String[] args) throws Exception{
         
        byte arr[] = {'a','b','c','d','e','f'};
        ByteArrayInputStream bis = new ByteArrayInputStream(arr);

        byte str[] = bis.readAllBytes();

        for(byte x:str){
            System.out.print((char)x);
        }
        System.out.println();
        System.out.println(bis.markSupported());


    }
}

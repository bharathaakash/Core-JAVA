import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class copyfile2 {
    public static void main(String[] args) throws Exception{
        
        FileInputStream fis1 = new FileInputStream("source1.txt");
        FileInputStream fis2 = new FileInputStream("Source2.txt");
        FileOutputStream fos = new FileOutputStream("destination1.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
        
        System.out.println(fis1.markSupported());
        int x;
        while((x=sis.read())!=-1){
            fos.write((char)x);
        }

        fis1.close();
        fis2.close();
        fos.close();
        sis.close();
    }
}

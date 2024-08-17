import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyfile1 {
    public static void main(String[] args) throws Exception{

       FileInputStream fis = new FileInputStream("source1.txt");
       FileInputStream fis1 = new FileInputStream("Source2.txt");
       FileOutputStream fos = new FileOutputStream("destination.txt");

       byte arr[] = new byte[fis.available()];
       fis.read(arr);
       fos.write(arr);

       arr = new byte[fis1.available()];
       fis1.read(arr);
       fos.write(arr);

       fis.close();
       fis1.close();
       fos.close();
    }
}

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyfile {
    public static void main(String[] args) throws Exception{
         
        FileInputStream fis = new FileInputStream("source1.txt");
        byte arr[] = new byte[fis.available()];
        fis.read(arr);

        String str = new String(arr);
        str = str.toLowerCase();

        FileOutputStream fos = new FileOutputStream("Source2.txt");
        fos.write(str.getBytes());

        fis.close();
        fos.close();


    }
}

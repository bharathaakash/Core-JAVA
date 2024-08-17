import java.io.FileInputStream;

public class filein {
    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("source1.txt");
        byte arr[] = new byte[fis.available()];
        fis.read(arr);

        String str = new String(arr);
        System.out.println(str);

        int x;
        while((x=fis.read())!=-1){
            System.out.println((char)x);
        }
    }
}

import java.io.FileOutputStream;

public class fileout {
    public static void main(String[] args) throws Exception{
        try(FileOutputStream fos = new FileOutputStream("bharath.txt")){
            
            String str = "I love Bharath Akash";
            String str1 = " He lives in Gollahalli";
            fos.write(str.getBytes());
            byte arr[] = str1.getBytes();
            // for(int i=0;i<arr.length;i++){
            //     System.out.print(arr[i]+" ");
            // }
            for(byte x : arr){
                fos.write(x);
            }
        }
    }
}

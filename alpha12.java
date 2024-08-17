import java.util.*;
public class alpha12 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=65;k<=65+i-1;k++){
                System.out.print((char)k+"");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=65;k<=65+i-1;k++){
                System.out.print((char)k+"");
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class number12 {
    public static void main(String[] srga){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+"");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+"");
            }
            System.out.println();
        }
    }
}

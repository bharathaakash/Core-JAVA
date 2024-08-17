import java.util.*;
public class alpha7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=65;j<=i+65-1;j++){
                System.out.print((char)j+"");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=65;j<=i+65-1;j++){
                System.out.print((char)j+"");
            }
            System.out.println();
        }
    }
}

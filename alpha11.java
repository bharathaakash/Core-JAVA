import java.util.*;
public class alpha11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=65;j<=i+65-1;j++){
                System.out.print((char)j+"");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=65;j<=65+i-1;j++){
                System.out.print((char)j+"");
            }
            System.out.println();
        }
    }
}

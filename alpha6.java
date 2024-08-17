import java.util.*;
public class alpha6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=65;k<=65+i-1;k++){
                System.out.print((char)k+"");
            }
            System.out.println();
        }
    }
}

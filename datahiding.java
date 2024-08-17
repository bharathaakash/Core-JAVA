import java.util.*;
class Rectangle{
    
    private float length;
    private float breadth;
    
    public void setLength(float l){
        length = l;
    }

    public void setBreadth(float b){
        breadth = b;
    }

    public float getLength(){
        return length;
    }

    public float getBreadth(){
        return breadth;
    }

    public float area(){
        return length*breadth;
    }

    public float perimeter(){
        return 2*(length + breadth);
    } 
}

public class datahiding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle re = new Rectangle();
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        re.setLength(length);
        re.setBreadth(breadth);
        System.out.println(re.area());
        System.out.println(re.perimeter()); 
        sc.close();
    }
}

class Rectangle {
     public int length = 2;
     public int breadth = 4;

     public float area(){
        return length*breadth;
     }
}


public class Rect {
    public static void main(String[] args){
        Rectangle re  = new Rectangle();

        System.out.println(re.length);
        System.out.println(re.breadth);
    }
}

class Rectangle{

    public static int length;
    public static int breadth;

    public static float area(){
        return length*breadth;
    }

    public float perimeter(){
        return 2*(length + breadth);
    }
}

class Cube extends Rectangle{

    public int height;

    public float volume(){
        return area()*height;
    }
}

public class inheri {
    public static void main(String[] args){
        Rectangle re =  new Rectangle();
        Cube cu = new Cube();
        
        re.length = 7;
        re.breadth = 9;
        System.out.println(re.length);
        System.out.println(re.breadth);
        System.out.println(re.area());


        cu.length = 5;
        cu.breadth = 5;
        System.out.println(cu.length);
        System.out.println(cu.breadth);
        System.out.println(cu.height);
        System.out.println(cu.area());
       // System.out.println();

        
    }    
}

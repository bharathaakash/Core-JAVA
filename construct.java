class Rectangle{
    
    int length;
    int breadth;
    
    public Rectangle(){
        length = 1;
        breadth = 1;
    }

    public Rectangle(int a , int b){
        length = a;
        breadth = b;
    }

    public float area(){
        return length*breadth;
    }

    public float perimeter(){
        return 2*(length + breadth);
    }
}

public class construct {
    public static void main(String[] args){
        Rectangle re = new Rectangle();
        System.out.println(re.area());
        System.out.println(re.perimeter());
    }
}

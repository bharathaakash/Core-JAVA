class Circle{

    public static int radius;

    static{
        radius = 314;
        System.out.println("this is static block");
    }

    public Circle(){

    }

    public Circle(int r){
        radius = r;
    }

    public static void show(){

        System.out.println("hii this is static method");
    }
}

public class stat {

    public static void main(String[] args){
        
        Circle c1 = new Circle(34);
        Circle c2 = new Circle();
        System.out.println("this is main"); //static block is executed only once it is used to initialize static variables
        System.out.println(Circle.radius);
        c1.radius = 3;
        System.out.println(Circle.radius);
        System.out.println(c2.radius);
    }
    
}

abstract class Shape{

    public abstract double area();
    abstract public double perimeter();
}

class Circle extends Shape{

    public int radius;

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }
}

class Square extends Shape{

    public int length;
    public int breadth;

    public Square(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        return length*breadth;
    }

    public double perimeter(){                // abstarct class or method cannot be final or static
        return 2*(length + breadth);          // abstract class can contain 0 or any number of abstract methods 
    }                                         // if any of the method in the class is abstract then the class must be declared as abstract
}                                             // abstract class can have only reference object cannot be created of the abstract class
                                              // the abstract method cannot be declared as private if we declared as private it cannot be accessed in sub class.
public class abst {                           // abstract method can contain both the abstract and the non abstarct method.
    public static void main(String[] args){

        Shape s = new Square(2,4);
        Square sq = new Square(2,4);

        //sq.length = 2;
        //sq.breadth = 4;
        System.out.println(s.area());
        System.out.println(s.perimeter());

        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    
    }
}

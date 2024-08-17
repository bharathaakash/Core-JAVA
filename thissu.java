class Circle{
    
    public int radius = 5;
    public int x=10;


    public double circum(){
        return 2*Math.PI*radius;
    }
}
class Cylinder extends Circle{

    public int height;
    public int x=20;

    public void pri(){
        System.out.println(x);
        System.out.println(super.x);
        System.out.println(super.radius);    // super is used only for name conflict i.e the x variable 
        System.out.println(radius);          // is present in both the class    
    }
}

public class thissu {
    public static void main(String[] args){
        Circle cr = new Circle();
        Cylinder cy = new Cylinder();
        
        cy.radius = 30;
        cy.x = 100;
        cy.pri();        
    }
}

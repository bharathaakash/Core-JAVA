class Grandparent{
    
    public int thatha;

    public Grandparent(){
        System.out.println("Grand parent");
    }
}
class Parent extends Grandparent{
    
    public int appa;

    public Parent(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    
    public int pulla;

    public Child(){
        System.out.println("Child");
    }
}

public class constinheri {
    public static void main(String[] args){
        
        Grandparent gp = new Grandparent();
        Parent pa = new Parent();
        Child ch = new Child();
        
        gp.thatha = 4;
        System.out.println(gp.thatha);
        System.out.println(ch.thatha);
        System.out.println(ch.appa);
        System.out.println(ch.pulla);
    }    
}

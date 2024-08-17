class A{

    public static void area(){
        System.out.println("static area from A");
    }

    public void peri(){
        System.out.println("non static from A");
    }
}

class B extends A{
    
    public static void area(){
        System.out.println("static from B");
    }
    public void peri(){
        System.out.println("non static from B");
    }
    public void suma(){
        System.out.println("suma ");
    }
}



public class staticheri {
    public static void main(String[] args){
        
        A a = new A();
        B b = new B();
        A c = new B();
        
        A.area();
        B.area();
        a.area();
        b.area();
        c.area();
        a.peri();
        b.peri();
        c.peri();
        b.suma();
    }
}

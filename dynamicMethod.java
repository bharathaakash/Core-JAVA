class Dog{

    public void method1(){
        System.out.println("method1 of super class");
    }

    public void method2(){
        System.out.println("method2 of super class");
    }
}

class Puppy extends Dog{
    
    @Override
    public void method2(){
        System.out.println("method2 of sub class");
    }

    public void method3(){
        System.out.println("method3 of sub class");
    }
}

public class dynamicMethod {
    public static void main(String[] args){
        
        Dog dg = new Puppy();

        dg.method1();
        dg.method2();
        //dg.method3();
    }
}

class Dog{
    
    int var1 = 2;

    public void show(){

        System.out.println("hii show");
    }

    Dog dg = new Dog(){
        public void show(){
            
            System.out.println("dog show");
        }
    };
}

public class annoy {
    public static void main(String[] args){

        Dog fo = new Dog();
        fo.dg.show();
    }
}

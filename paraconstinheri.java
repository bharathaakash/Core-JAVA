class Father{

    public Father(){
        System.out.println("non-pram of Parent");
    }

    public Father(int x){
        System.out.println("pram of parent");
    }
}
class Son extends Father{

    public Son(){
        System.out.println("non-pram of child");
    }

    public Son(int x){
        super(x);
        System.out.println("pram of child");
    }
}
public class paraconstinheri {
    public static void main(String[] args){
        //Father fa = new Father(2);      
        Son so = new Son(2);
    }   
}

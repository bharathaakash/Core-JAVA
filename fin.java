class recti{
    
    final int bre = 45;  
    
    final int len;
    {
        len = 10;
        System.out.println("instance block 1");
    }
    
    static final int re;
    
    static{
        re = 23;
        System.out.println("static block");
    }

    int height = get();

    {
        System.out.println("instance block 2");
    }
    
    int get(){
        
        System.out.println(("get block"));
        return 20;
    }

    public recti(){

        System.out.println("constructor block");
    }
}
public class fin {

    public static void main(String[] args){
        
        recti r = new recti();
        recti r1 = new recti();
        System.out.println("main block");


        // if the variable is final their value cannot be changed 
        // if the method is final it cannot be overriden
        // if the class is final it cannot be extended 
    }
    
}

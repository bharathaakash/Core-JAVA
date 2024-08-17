abstract class Poomex{
    
    int poo = 45;
    public abstract void show();
}

public class annoy1 {
    
   static int var1 = 10;
    public static void main(String[] args){
        int var2 = 30;
        Poomex po = new Poomex(){
        
            public void show(){

                System.out.println("hii this is bharath"+var1+" "+var2+" "+poo); // same for interface also.
            }                                                                    // it is actually extending Poomex class so we can access poo variable.
        };
        po.show();
    }
    
}

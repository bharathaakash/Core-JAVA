class Laptop{
    
    public String toString(){
        return "Laptop class";
    }
    public int hashCode(){
        return 100;
    }
    public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
    }

}
public class objclass{
    public static void main(String[] args){
        
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
           
           System.out.println(l1.equals(l2));
           System.out.println(o1.equals(o2));
        // System.out.println(o1.getClass());
        // System.out.println(l1.getClass());
         System.out.println(l1);
        // System.out.println(o1);
        // System.out.println(o1.equals(o2));
        // System.out.println(o1.equals(o3));
        System.out.println(o1.equals(l1));
         System.out.println(o1.hashCode());
         System.out.println(l1.hashCode());
         System.out.println(l2.hashCode());
        // System.out.println(o3.hashCode());
        // System.out.println(o2.hashCode());
        System.out.println(l1.equals(l2));
        

    }
}

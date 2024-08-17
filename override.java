class Ramesh{

    public void suma(){
        System.out.println("Super class");
    }
}

class Bharath extends Ramesh{

    public void suma(){
        System.out.println("Sub class");
        super.suma();
    }
}
public class override {
    public static void main(String[] args){
    
        Bharath bh = new Bharath();
        bh.suma();

        Ramesh ra = new Bharath();          // calls the sub class display with super class reference
        ra.suma();
    }
}

interface smart{
    void display();
}

class dummy{

    public void show(smart s){
        s.display();
    } 
}


public class lamb2 {
    public static void main(String[] args){
        dummy d = new dummy();
        d.show(()->{System.out.println("hii");});
    }
}

interface writer{
    
    void show();
} 

class Pen implements writer{

    public void show(){
         
        System.out.println("written by pen");
    }
}

class Pencil implements writer{

    public void show(){

        System.out.println("written by pencil");
    }
}

class kit{

    public void write(writer w){
        
        w.show();
    }
}

public class interfa1 {
    
    public static void main(String[] args){
        
        kit kt = new kit();
         
        writer pc = new Pencil();
        writer pe = new Pen();

        kt.write(pe);

    }
}

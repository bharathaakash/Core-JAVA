interface car{
   
    void drive();
    static void accel(){
        System.out.println("car moving");
    }

    default void breaak(){
        System.out.println("car stop");
    }
    private void clutch(){
        System.out.println("press the clutch");
    }
}

class Jeep implements car{

    public void drive(){
        System.out.println("drive by driver");
    }
}

public class interfa3 {
    public static void main(String[] args){

        Jeep jp = new Jeep();
        
        jp.drive();
        jp.breaak();
        //jp.accel(); //static method cannot be accessed
    }
    
}

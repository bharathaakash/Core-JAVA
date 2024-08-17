class Mythread implements Runnable{

    public void run(){

        while(true){
            System.out.println("hello");
        }
    }
}

public class threarun {
    public static void main(String[] args){
        
        Thread t  = new Thread(new Mythread());
        t.start();
        // while(true){
        //     System.out.println("world");
        // }
        System.out.println("stop");
    }
    
}

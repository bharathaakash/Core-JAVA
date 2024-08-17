class mythread implements Runnable{
    
    public void run(){
        
        int count = 1;
        while(true){
            System.out.println(count+" hello world");
            count++;
        }

    }
}
public class threarun2 {
    public static void main(String[] args) throws Exception{

        Thread t = new Thread(new mythread());
        //t.setDaemon(true);
        //System.out.println("priority"+t.getPriority());
        t.start();
        t.join();   //joins the t thread alone

        //t.interrupt();
        //Thread maint = Thread.currentThread();
    
        //maint.join();   joins all the thread
    
        //int count = 1;
        /*while(true){
            System.out.println(count+" bharath");
            count++;
            Thread.yield();
        }*/
        System.out.println("stop");

    }
}

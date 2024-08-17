class MyThread extends Thread{
    
    public void run(){
       while(true){
        System.out.println("Hello");
        try{Thread.sleep(1000);}catch(Exception e){}
       }
    }

}

public class threa {
    
    public static void main(String[] a){
    MyThread t = new MyThread();
    t.start();
    while(true){
        System.out.println("world");
        try{Thread.sleep(1000);}catch(Exception e){}
    }

   }    
}

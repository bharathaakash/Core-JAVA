class Work{


    synchronized public void setValue(){
          
    }

    synchronized public void getValue(){
          
    }
}

class Producer extends Thread{
    
    Work w;

    public Producer(Work w){
        this.w = w;
    }
    
    public void run(){
        
        while(true){
            w.setValue();
            System.out.println("bharath");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}        

class Consumer extends Thread{

    Work w;
    
    public Consumer(Work w){
        this.w = w;
    }

    public void run(){
        //w.getValue();
        while(true){
            w.getValue();
            System.out.println("from gollahalli");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
public class synthetic{
   
    public static void main(String[] args){
     Work w = new Work();
     Producer p = new Producer(w);
     Consumer c = new Consumer(w);

     p.start();
     c.start();
   } 
}

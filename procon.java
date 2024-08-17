class Work{

    int value;
    boolean flag = true;

    synchronized public void setValue(int v){
       while(flag != true)
         try{wait();}catch(Exception e){}
       value = v;
       flag = false;
       notify();
    }

    synchronized public int getValue(){
        while(flag != false)
          try{wait();}catch(Exception e){}
        flag = true;
        notify();

        return value;
    }
}

class Producer extends Thread{
    
    Work w;

    public Producer(Work w){
        this.w = w;
    }
    
    public void run(){
        int count = 0;
        while(true){
            w.setValue(count);
            System.out.println("Producer "+count);
            count++;
            try{Thread.sleep(10);}catch(Exception e){}
        }
    }
}

class Consumer extends Thread{

    Work w;
    
    public Consumer(Work w){
        this.w = w;
    }

    public void run(){
        int value=0;
        while(true){
            value = w.getValue();
            System.out.println("Consumer "+ value);
            try{Thread.sleep(10);}catch(Exception e){}
        }
    }
}

public class procon {
    public static void main(String[] args){
        Work w = new Work();
        Producer p = new Producer(w);
        Consumer c = new Consumer(w);

        p.start();
        c.start();

        
    }   
}

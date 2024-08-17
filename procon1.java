class Work{

    int value;
    //boolean flag = true;

    synchronized public void setValue(int v){

       value = v;
    }

    synchronized public int getValue(){
        

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
            //try{Thread.sleep(10);}catch(Exception e){}
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
            //try{Thread.sleep(10);}catch(Exception e){}
        }
    }
}
public class procon1 {
    public static void main(String[] args){
        Work o = new Work();
        Producer p = new Producer(o);
        Consumer c = new Consumer(o);

        p.start();
        c.start();
    }
}

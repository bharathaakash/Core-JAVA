import java.io.*;

class Producer extends Thread{
    
    OutputStream o;
    
    public Producer(OutputStream o){
        this.o = o;
    }
    
    int count = 1;
    public void run(){
        while(true){
            try {
                o.write(count);
                o.flush();
                System.out.println("Producer "+count);
                count++;
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }

}

class Consumer extends Thread{
    
    InputStream i;
    
    public Consumer(InputStream i){
        this.i = i;
    }
    
    //int count = 1;
    int x;
    public void run(){
        while(true){
            try {
                x = i.read();
                //o.flush();
                System.out.println("Consumer "+x);
                //count++;
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }

}
public class pipeio {
    public static void main(String[] args) throws Exception{
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream();

        pos.connect(pis);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}

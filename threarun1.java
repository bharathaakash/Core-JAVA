class Mythread extends Thread{
    
    public Mythread(String str){
        super(str);
    }
    public void run(){
        
    }
}

public class threarun1 {

    public static void main(String[] args){
       
        Mythread t = new Mythread("bharath thread");
        System.out.println("Id "+t.getId());
        System.out.println("Name "+t.getName());
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("priority "+t.getPriority());
    
        System.out.println("state "+t.getState());
        System.out.println("Alive "+t.isAlive());        
    }
    
}

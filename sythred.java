class Show{

    synchronized public void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            //try{Thread.sleep(10000);}catch(Exception e){}
        }
      
    }
}

class MyThread extends Thread
{
    Show s;
    String arr = null;
    public MyThread(String str,Show r){
       this.s=r;
       this.arr = str;
    }
    public void run(){
        s.display(arr);
    }
}

public class sythred {
    public static void main(String[] args){
        Show s = new Show();
        MyThread t  = new MyThread("bharath",s);
        MyThread r  = new MyThread("fromGollahalli",s);
        t.start();
        r.start();
        
    }
    
}

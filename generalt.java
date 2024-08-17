class Obj{
    synchronized public void display(String str){
        for(int i=0;i<str.length();i++){
            //try{Thread.sleep(1000);}catch(Exception e){}
            System.out.print(str.charAt(i));
            //try{Thread.sleep(10000);}catch(Exception e){}
        } 
    }
    synchronized public void show(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
}
class Pro extends Thread{
    Obj o;
    public Pro(Obj o){
        this.o = o;
    }
    public void run(){
        o.display("Hello this is bharath from skct");
    }
}
class Con extends Thread{
    Obj o;
    public Con(Obj o){
        this.o = o;
    }
    public void run(){
        o.show("World the grand of universe");
    }
}

public class generalt {
    public static void main(String[] args){
        Obj o = new Obj();
        Pro p = new Pro(o);
        Con c = new Con(o);

        p.start();
        c.start();
    }
    
}

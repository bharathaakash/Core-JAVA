class outer{
     
    int x=10;
    inner in = new inner();

    
    public void display(){
        System.out.println("method from outer class");
    }

    class inner{

        int y=33;

        public void innerdis(){
            System.out.println("method from inner class "+x);
        }
    }

    public void dis(){

       // inner in = new inner();
       // System.out.println(in.y);
       in.innerdis();

    }
}


public class innercl {
    public static void main(String[] args){
        outer ou = new outer();
        ou.dis();
        ou.display();
        outer.inner oi = new outer().new inner();
        System.out.println(oi.y);
    }
}

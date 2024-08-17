interface top{
     int sum(int x,int y);
}
interface Mobile{
    void display();
}

public class lamb {
    public static void main(String[] args){
        
        Mobile mb = ()-> System.out.println("hii this is bharath");

        top lp  =(x,y)-> x+y;
        System.out.println(lp.sum(2,4));
        mb.display();
    }
}

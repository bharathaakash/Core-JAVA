class outer1{

    public int var1=4;

    public void show(){

        class inner1{

            public int var2=9;

            public void write(){
                
                System.out.println(var1);
2            }

            //inner1 in = new inner1(); this is not allowed if we create a object in class it cannot accessed out side the class
            //in.write();

        }
        inner1 in = new inner1();
        in.write();
    }
}


public class locin {
    
    public static void main(String[] args){

        outer1 ou = new outer1();
        ou.show();
    }
}

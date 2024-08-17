public class overload {
    
    static byte max(byte x,byte y){               // overload is based only on data type of paramater
        System.out.println("byte method");        // and number of parameter not the return type of  
        return x>y ? x:y;                         // method
    }

    static int max(int x,int y){
        System.out.println("int method");         
        return x>y ? x:y;
    }

    static float max(float x,float y){
        System.out.println("float method");
        return x>y ? x:y;
    }

    public static void main(String[] args){
        byte a=1,b=2; 
        System.out.println(max(a,b));
    }
}

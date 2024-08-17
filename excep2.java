class NegativeDimException extends Exception{
    
    public NegativeDimException(String s){

        super(s);
        //System.out.println("hii");
    }
    // public String toString(){
       
    //     return "negative dimensions give positive dimensions";
    // }
}



public class excep2 {

    static int area(int length,int breadth) throws NegativeDimException{
        
        if(length<0 || breadth<0){
            throw new NegativeDimException("negative");
        }

        return length*breadth;
    }
    public static void main(String[] args){
       try{
         System.out.println(area(-10,20));
       }
       catch(Exception e){
         System.out.println(e); // it will call to string only not constructor
       }                        // if you override toString the constructor parameter string will not display.
    }
}

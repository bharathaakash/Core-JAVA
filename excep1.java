public class excep1 {
    
    static void meth3() throws Exception{
        try{    
            System.out.println(34/0);
        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("hii this is bharath");    
    }   
    
    static void meth2(){
         
        // meth3();       
        try{
            meth3();
        }
        catch(Exception e){
            System.out.println("catch block");
        }  
    }

    static void meth1(){
        meth2();
    }              // the exception should be handled in any on eof the calling method

    public static void main(String[] args){
         meth1();
        
    }
}

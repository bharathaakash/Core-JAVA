class ATM{
    synchronized public void checkbalance(String str){
        System.out.println(str+" is checking balance");
    }
    synchronized public void withdraw(String str,int amount){
        System.out.println(str+" is withdrawing balance "+amount);
    }
}

class Customer extends Thread{
    ATM a;
    String name = null;
    int amount;

    public Customer(ATM a,String str,int amount){
       this.a = a;
       this.name = str;
       this.amount = amount;
    }

    public void run(){
        a.checkbalance(name);
        try{Thread.sleep(100);}catch(Exception e){}
        a.withdraw(name,amount);
    }

}
public class atmthread {
    public static void main(String[] args){
        ATM a = new ATM();
        Customer c1 = new Customer(a,"bharath",1000);
        Customer c2 = new Customer(a,"ravi",50000);
        c1.start();
        c2.start();
    }    
}

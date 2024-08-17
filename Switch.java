import java.util.*;
class Switch{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:"); 
	  //int x = sc.nextInt();
	  String str = sc.nextLine();
      switch(str){
	    
		default:
		   System.out.println("no output");
		   break;

	    case "1":
		    System.out.println("one");
		    break;
	      
		case "2":
		    System.out.println("two");
            break;
      }
	  sc.close();
  
  }


}

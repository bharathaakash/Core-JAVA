public class stbyffer {
    public static void main(String[] args){
        String str = "bharath";
        StringBuffer str1 = new StringBuffer("ravi");
        StringBuilder str2 = new StringBuilder("kuppusamy");

        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());

        str = str.concat(" akash");
        str1.append(" chandran");
        str2.append(" gollahalli");

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        StringBuffer str4 = new StringBuffer("ravi");
        
        System.out.println(str4.capacity());
        System.out.println(str4.deleteCharAt(1));
        System.out.println(str4.insert(1, 'a'));
        System.out.println(str4.delete(1, 3));
        System.out.println(str4.insert(1, "av"));
        
        StringBuffer str5 = new StringBuffer("bharath");
        System.out.println(str5.subSequence(1, 4));
        System.out.println(str5.substring(2));
        System.out.println(str5.substring(2,6));


    }
}

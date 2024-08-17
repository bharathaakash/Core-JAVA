public class intclass {
    public static void main(String[] a){
        
        int b = 10;
        Integer c = b;
        Integer d = 20;
        Integer e = Integer.valueOf(30);
        Integer f = Integer.valueOf("50");

        byte g = 40;
        Byte h = Byte.valueOf("60");
        //Byte i = Byte.valueOf(20); integer litral cannot be converted to byte
        Byte i = Byte.valueOf(g);

        Short j = Short.valueOf("123");

        float k = 12.5f;
        Float l = Float.valueOf("123.45");
        
        Boolean m = true;
        Boolean n = Boolean.valueOf("false");

        Character o = 'a';
        Character p = Character.valueOf('f');

        float q = l.floatValue();
        int r = f.intValue();
        float s = f.floatValue();


       // System.out.println(f);


        int x = 20;
        Integer y = 30;
        Integer z = 50;
        System.out.println(z.compareTo(z));

        System.out.println(y.equals(x));

        System.out.println(Integer.valueOf("1010", 2));
        // binary to integer;

        System.out.println(Integer.toBinaryString(10));
        // integer to binary

        Float x = 12.5f;
        float y = 12.5f;
        Float z  = 12.5f/0;
        System.out.println(x.equals(y));

        System.out.println(Float.isNaN(y));
        System.out.println(Float.isFinite(y));
        System.out.println(Float.);
        String str = "bharath";
        char arr[] = str.toCharArray();
        Character x = 'a';
        Character y = '8';
        Character z = 'A';
        
        System.out.println(Character.toUpperCase(x));
        System.out.println(Character.toLowerCase(z));
        System.out.println(Character.isAlphabetic(x));
        System.out.println(Character.isDigit(y));
        System.out.println(Character.isLetterOrDigit(y));





    }
}

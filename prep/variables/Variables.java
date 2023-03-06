package prep.variables;



class Variables {

    
    public static void main(String[] args) {
        // primitive types
        int i = 42;
        long l = 8675309;
        boolean b = true;
        double d = 3.14;
        char c = 't';

        System.out.printf("The integer is %d\n", i);
        System.out.printf("The computer sees it as %s\n", Integer.toBinaryString(i));
        System.out.printf("The long is %d\n", l);
        System.out.printf("The computer sees it as %s\n", Integer.toBinaryString((int)l));
        System.out.printf("The boolean is %b\n", b);
        System.out.printf("The double is %f\n", d);
        System.out.printf("The char is %c\n", c);
        System.out.printf("The computer sees it as %d\n", (byte)c);
        System.out.printf("The computer sees it as %s\n", Integer.toBinaryString((int)(byte)c));
        
        // object types i.e. Wrapper Classes

        Integer intObj = 42;
        Long longObj = 8675309l;
        Boolean boolObj = true;
        Double doubleObj = 3.14;
        Character charObj = 't';

        // other built in objects:

        String myString = "I like coffee";

        // souts

        System.out.println(intObj.SIZE);
    }






    
}
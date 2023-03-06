package demos.fundamentals.variables;



class Variables {

    
    public static void main(String[] args) {
        // primitive types
        int myFavNum = 42;

        System.out.println(myFavNum);
        System.out.printf("The computer sees it as %s\n", Integer.toBinaryString(myFavNum));
        
        long bigNum = 30000000000000L;
        System.out.println(bigNum);
        
        double d = 3.14;
        System.out.println(d);
        
        char c = 't';
        System.out.println(c);
        System.out.printf("The computer sees it as %d\n", (byte)c);
        String letter = "t";


        // object types i.e. Wrapper Classes

        Integer age = 47;
        System.out.println(age.SIZE);
        Double pi = 3.14;
    }






    
}
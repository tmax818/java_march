package demos.fundamentals.typecasting;

public class TypeCasting {

    public static void main(String[] args) {
        // Explicit casting
        double d = 35.25;
        double dd = 35.99;
        
        // casting the double d into a int
        // double is 8 bytes, while int is 4 bytes
        int i = (int) d;
        
        // casting the double dd into a int
        int ii = (int) dd;
        System.out.println(i);
        System.out.println(ii);
        
        // Implicit casting
        float f = i;
        System.out.println("The number is: " + f);
    }

    
}

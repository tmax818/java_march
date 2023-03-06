package demos.fundamentals.fixedarrays;

import java.util.Arrays;

public class FixedArrays {

    public static void main(String[] args) {
        
        // fixed array of ints
        int[] intArray = new int[4];
        intArray[0] = 42;
        intArray[1] = 43;
        intArray[2] = 2;
        intArray[3] = 13;
        intArray[3] = 99;
        // intArray[4] = 100;
        intArray[1] = 12345;
        System.out.println(Arrays.toString(intArray));
        
        
        // fixed array of doubles
        double[] doubleArray = {3.4, 5.4, 5.0};
        System.out.println(Arrays.toString(doubleArray));

        
        // fixed array of strings
        // String[] people = {"tyler", "Stephanie", "Hamzeh"};
        String[] people = new String[3];
        people[0] = "Tyler";
        System.out.println(Arrays.toString(people));


    }
}
    
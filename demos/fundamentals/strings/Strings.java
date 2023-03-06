package demos.fundamentals.strings;

public class Strings {

    public static void main(String[] args) {
        // create a string
        String name = "Tyler";
        String student = "Jay";
        int age = 39;
        double pi = 3.14;
        System.out.println(name);
        System.out.println(student);
        // .concat two strings
        System.out.println(name.concat(student));

        // use .format
        String message = String.format("%s wishes he was still %d! Sorry, bro!! Pi is %f", name, age, pi);
        System.out.println(message);
        System.out.println(name + " is the teacher of " + student);
        



    }
    
}

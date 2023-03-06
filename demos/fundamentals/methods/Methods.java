package demos.fundamentals.methods;

public class Methods {

    public int sayAge(){
        return 39;
    }

    // overloaded methods
    public String Greet(){
        return "Hello, Tyler! Nice to see you!";
    }

    public String Greet(String name){
        // return "Hello, " + name + "! Nice to see you!";
        return String.format("Hello %s! Nice to see you!", name);
    }

    public String Greet(String name, String greeting){
        return String.format("Hello %s! %s", name, greeting);
    }

    
}

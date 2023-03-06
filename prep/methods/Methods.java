package prep.methods;

public class Methods {

    public String Greet(){
        return "Hello, Dave. Nice to see you today.\n";
    }

    public String Greet(String name){
        return String.format("Hello, %d. Nice to see you today.\n", name);
    }

    public String Greet(String name, String greeting){
        return String.format("Hello, %d. %d\n", name, greeting);
    }
    
}

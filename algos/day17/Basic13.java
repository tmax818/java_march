

public class Basic13 {

    //## TODO: Print all the integers from 1 to 255.
    public static void printNumbers1() {
        for(int i = 1; i <= 255; i++) {
          System.out.println(i);
        }
    }
    
    //## TODO: Print integers from 0 to 255, and with each integer print the sum so far.
    
    public static void printSum(){
        int sum = 0;
        for(int i = 0; i <= 255; i++) {
            sum += i;
          System.out.println(sum);  
          System.out.println(i);
        }
      }
    
}

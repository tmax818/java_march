import java.util.ArrayList;

public class CafeUtil {

    /**
     * this is the getStreakGoal method they made me write!!!
     * @param numWeeks
     */ 
    public int getStreakGoal(){
        int sum = 0;
        for(int i = 0; i <= 10; i++){
            sum += i;
        }
        return sum;
    }

    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i = 0; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    
    /**
     * Given an array of item prices from an order, sum all of the prices in the array and return the total.
    Don't forget to test your code! Find the lines of test code for this method in TestCafe.java and uncomment it before you compile and run.
     * @param prices an array of doubles
     * @return total; sum of all the prices in the array param
     */ 
    public double getOrderTotal(double[] prices){
        double total = 0;
        for(int i = 0; i < prices.length; i++){
            total += prices[i];
        }
        return total;
    }

     /**
      * void displayMenu(ArrayList<String> menuItems)
      *  Given an ArrayList of menu items (strings), print out each index and menu item.
      *  @param menuItems
        @return formatted menu 
      */
      public void displayMenu(ArrayList<String> menuItems){
            for(int i = 0; i < menuItems.size(); i++){
                System.out.printf("\t%d\t%s\n",i, menuItems.get(i));
            }
      }

      /**
       * Print this string to the console: "Please enter your name:"
       * @param customers
       * Next print the userName to the console, saying "Hello, [username here]!"
        Next print "There are ___ people in front of you" using the number for how many people are ahead of them (how many items already in the array)
Then, add the customer's name to the given customers list. And print the list.
       */
      public void addCustomer(ArrayList<String> customers){
            System.out.println("Please enter your name:");
            String userName = System.console().readLine();
            System.out.println("Hello, " + userName);
            System.out.printf("There are %d people in front of you\n", customers.size());
            customers.add(userName);
            System.out.println(customers);


      }
}

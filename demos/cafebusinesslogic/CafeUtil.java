



public class CafeUtil {

    /**
     * this is the getStreakGoal method they made me write!!!
     * @param none
     */ 
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i = 0; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }
    
}

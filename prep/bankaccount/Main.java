package prep.bankaccount;

public class Main {

    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(1000, .1);
        c.deposit(1000);
        System.out.println(c);
    }
    
}

package prep.bankaccount;


abstract class BankAccount {

    // fields/attributes for the instance
    protected double balance;
    protected double intRate;

    // static/class attributes/fields
    public static int totalAccounts;
    public static double totalDeposits; 


    // Constructor
    public BankAccount(double balance, double intRate) {
        BankAccount.totalAccounts++;
        BankAccount.totalDeposits += balance;
        this.balance = balance;
        this.intRate = intRate;
    }


    @Override
    public String toString() {
        return "{" +
            " balance='" + getBalance() + "'" +
            ", intRate='" + getIntRate() + "'" +
            "}";
    }



    // methods

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void yieldInterest(){
        System.out.println(balance);
        System.out.println(intRate);
        System.out.println(balance * intRate);
        this.balance += (balance * intRate);
        
    }

    // getters and setters


    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getIntRate() {
        return this.intRate;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }






    
}
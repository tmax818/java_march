package demos.oop.bankaccount;


class BankAccount {

    // fields/attributes for the instance
    private double balance;
    private double intRate;

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

    public void deposit(double amount){
        // this.balance += amount;
        this.setBalance(amount + this.balance);
        BankAccount.totalDeposits += amount;
    }

    public void withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
            BankAccount.totalDeposits -= amount;
        } else {
            this.balance -= 5;
            BankAccount.totalDeposits += 5;
            System.out.println("Insufficient funds: Charging a $5 fee");
        }
    }

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
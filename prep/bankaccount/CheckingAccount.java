package prep.bankaccount;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance, double intRate) {
        super(balance, intRate);

    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {

    }




    
}

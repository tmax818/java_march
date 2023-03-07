package demos.oop.bankaccount;

public class Main {

    public static void main(String[] args) {
        BankAccount b = new BankAccount(10000, 0.1);
        System.out.println(b);
        // b.deposit(1000);
        // b.withdraw(5000);
        // b.withdraw(7000);
        b.yieldInterest();
        System.out.println(b);
        System.out.println(BankAccount.totalAccounts);
        System.out.println(BankAccount.totalDeposits);
    }
    
}

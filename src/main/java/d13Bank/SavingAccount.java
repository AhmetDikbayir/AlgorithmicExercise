package d13Bank;

public class SavingAccount implements Account{

    private double balance = 100;
    @Override
    public double deposit(int val) {
        balance += val;
        return balance;
    }

    @Override
    public double withdraw(int val) {
        balance  -= val;
        return balance;
    }

    @Override
    public double calculateInterest(double intRate) {
        return balance*(intRate/100);
    }

    @Override
    public void viewBalance() {
        System.out.println(balance);
    }
}

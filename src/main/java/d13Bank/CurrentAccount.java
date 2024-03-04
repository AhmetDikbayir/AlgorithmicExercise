package d13Bank;

public class CurrentAccount implements Account{

    private double balance;
    @Override
    public double deposit(int val) {
        balance += val;
        return balance;
    }

    @Override
    public double withdraw(int val) {
        balance-=val;
        return balance;
    }

    @Override
    public double calculateInterest(double intRate) {
        return 0;
    }

    @Override
    public void viewBalance() {
        System.out.println(balance);
    }
}

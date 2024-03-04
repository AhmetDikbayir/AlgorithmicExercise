package d13Bank;

public interface Account {

    double deposit(int val);

    double withdraw(int val);

    double calculateInterest(double intRate);

    void viewBalance();
}

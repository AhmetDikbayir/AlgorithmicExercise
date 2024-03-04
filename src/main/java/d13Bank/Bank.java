package d13Bank;

public class Bank {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount();
        CurrentAccount c1 = new CurrentAccount();
        s1.viewBalance();
        double intR2 = s1.calculateInterest(25);
        System.out.println(intR2);
        s1.deposit(50);
        s1.viewBalance();
        s1.withdraw(20);
        s1.viewBalance();
        double intR = s1.calculateInterest(25);
        System.out.println(intR);
    }
}

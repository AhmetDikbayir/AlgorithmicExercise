package d5codeExercise;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        //Soru-12:Bankamatik Sorusu-->Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
        Scanner input = new Scanner(System.in);
        int balance = 1000;
        int money = 0;
        do {
            System.out.println("Welcome!\n" +
                    "Press 1. Learning account balance \n" +
                    "Press 2. Depositing money\n" +
                    "Press 3. Withdrawing money\n" +
                    "Press 4. Quit");
            int operation = input.nextInt();
            if (operation == 1) {
                System.out.println("You have $" + balance);
            } else if (operation == 2) {
                System.out.println("Please enter how much you want to deposit:");
                money = input.nextInt();
                balance += money;
                System.out.println("Your update account balance is $" + balance);
            } else if (operation == 3) {
                System.out.println("Please enter how much you want to withdraw from your account:");
                money = input.nextInt();
                balance -= money;
                System.out.println("Your update account balance is $" + balance);
            }else{
                System.out.println("Your session was closed successfully. Have a good day. See you soon!");
                break;
            }

        } while (true);
    }
}

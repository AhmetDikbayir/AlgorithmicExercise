package d8codes_exercises;

import java.util.Scanner;

public class TernaryQ1 {
    public static void main(String[] args) {
        //SORU1
        /*
                   Eğer age 10 dan küçük veya eşit ise
                   facebook hesabi acmak icin cok gencsin print yapın.

                   Eğer age 16 dan küçük veya eşit ise
                   ehliyet almak icin cok gencsin print yapın.

                   Eğer age 18 den küçük veya eşit ise
                   dovme yaptirmak icin cok gencsin print yapın.

                   Eğer age 21 den küçük veya eşit ise
                   alkol icmek icin cok gencsin print yapın.

                   Eğer age 21 den büyük ise
                   istedigini yapabilirsin print yapın.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = input.nextInt();

        System.out.println((age<11)? "You are too young for having a facebook account!!" :
                (age<17) ? "You are too young for getting a driver licence!" :
                        (age<19) ? "You are too young for tattoo!!" :
                                (age<22) ? "You are too young for drinking alcohol!" : "You can do whatever you want...");

        input.close();
    }
}

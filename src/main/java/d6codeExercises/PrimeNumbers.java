package d6codeExercises;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int num = input.nextInt();
        int dividing = 0;

        if (num < 2) {
            System.out.println("The number is not prime.");

        } else if (num == 2) {
            System.out.println("The number is prime...");
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    dividing++;
                }
            }

            if(dividing != 0){
                System.out.println("The number is not prime.");
            } else {
                System.out.println("The number is prime...");
            }
        }

        input.close();

    }
}

package d1algorithms;

import java.util.Scanner;

public class Exercises05 {
    public static void main(String[] args) {
        //Get ten numbers from the user and find even / odd number
        //sum of even numbers
        //sum of odd numbers
        //Average of even numbers
        //Average of odd numbers

        Scanner scan = new Scanner(System.in);

        int oddNumbers = 0;
        int evenNumbers = 0;
        int oddNumCounter = 0;
        int evenNumCounter = 0;
        double averageOddNum = 0;
        double averageEvenNum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Please enter " + i + ". numbers: ");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                evenNumbers += num;
                evenNumCounter ++;
            } else {
                oddNumbers += num;
                oddNumCounter ++;
            }
        }
        averageOddNum = oddNumbers/oddNumCounter;
        averageEvenNum = evenNumbers/evenNumCounter;
        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("oddNumbers = " + oddNumbers);
        System.out.println("averageEvenNum = " + averageEvenNum);
        System.out.println("averageOddNum = " + averageOddNum);

    }
}

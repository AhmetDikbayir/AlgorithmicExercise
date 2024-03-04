package d5codeExercise;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        //Soru-16:Kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year:");
        int year = input.nextInt();

        boolean isLeapYear = (year %4 == 0 && year %100 !=0) || (year % 100 == 0 && year %400 == 0);
        System.out.println(isLeapYear ? "This year is leap year." :  "This year is not a leap year.");
    }
}

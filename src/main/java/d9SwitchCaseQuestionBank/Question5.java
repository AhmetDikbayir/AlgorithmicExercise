package d9SwitchCaseQuestionBank;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /*
                Write a code to display the number of days in a specific month of a given year.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year:");
        int year = input.nextInt();
        System.out.println("Please enter a month number:");
        int month = input.nextInt();
        int daysOfMonth = 30;

        switch (month){
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                daysOfMonth = 31;
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                daysOfMonth = 30;
                break;
            case(2):
                if((year%4 == 0 && year %100 != 0) || (year%400 == 0 && year %100 == 0)){
                    daysOfMonth = 29;
                    break;
                }
                else {
                    daysOfMonth = 28;
                    break;
                }
        }
        System.out.println("Days of the month: " + daysOfMonth);
        input.close();
    }
}

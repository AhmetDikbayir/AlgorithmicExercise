package d9SwitchCaseQuestionBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        /*
                Write a code that prints all the month names starting from the given month number.
                For example: if user enter 9 output is "September - October - November - December"
         */

        ArrayList<String> months = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1-12:");
        int month = input.nextInt();

        switch (month) {
            case (1):
                months.add("January");
            case (2):
                months.add("February");
            case (3):
                months.add("March");
            case (4) :
                months.add("April");
            case (5):
                months.add("May");
            case (6):
                months.add("June");
            case (7):
                months.add("July");
            case (8) :
                months.add("August");
            case (9):
                months.add("September");
            case (10):
                months.add("October");
            case (11):
                months.add("November");
            case (12) :
                months.add("December");
                break;
            default:
                break;
        }

        if(month >12 && month<1){
            System.out.println("You entered invalid number");
        }else{
            for(String w : months){
                System.out.print(w + " ");
            }
        }
        input.close();
    }
}

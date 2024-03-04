package d9SwitchCaseQuestionBank;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        /*
                Convert from mile to km
                second to hour
                fahreneit to celcius
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please choose to convertor:\n" +
                "1- Mile to km (Press 1)\n" +
                "2- Second to Hour (Press 1)\n" +
                "3- Fahreneit to Celcius (Press 1)");
        int operation = input.nextInt();
        System.out.println("Please enter a number for converting:");
        int num = input.nextInt();
        double result = 0;

        switch (operation) {
            case (1):
                result = 1.6 * num;
                break;
            case (2):
                result = num / 60;
                break;
            case (3):


        }
    }
}

package d9SwitchCaseQuestionBank;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        /*
            December, January, February ==> Winter
            March, April, May ==> Spring
            June, July, August ==> Summer
            September, October, November ==> Autumn
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter s month name: ");
        String month = input.next().toLowerCase();

        switch (month){
            case ("december"):
            case ("january"):
            case("february"):
                System.out.println("Winter");
                break;
            case("march"):
            case("april"):
            case("may"):
                System.out.println("Spring");
                break;
            case("june"):
            case("july"):
            case("august"):
                System.out.println("Summer");
                break;
            case("september"):
            case("october"):
            case("november"):
                System.out.println("Autumn");
                break;
            default:
                System.out.println("It is not a month!");
                break;
        }
        input.close();
    }
}

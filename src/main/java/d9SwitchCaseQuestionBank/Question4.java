package d9SwitchCaseQuestionBank;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        /*
            If user enter "Male" ==> "Male"
            "Female" ==> "Female"
            if gender different from male and female then output is "Others"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your gender:");
        String gender = input.next().toLowerCase();

        switch (gender){
            case ( "female"):
                System.out.println("Feamle");
                break;
            case ("male"):
                System.out.println("Male");
                break;
            default:
                System.out.println("Others");
                break;
        }
        input.close();
    }
}

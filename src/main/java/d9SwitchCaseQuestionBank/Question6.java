package d9SwitchCaseQuestionBank;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        /*
            Write a calculator codes doing sum - substract - multiply and divide
            if user enter different operation "Invalid operation"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number:");
        double num1 = input.nextDouble();
        System.out.println("Please enter second number:");
        double num2 = input.nextDouble();
        System.out.println("Please enter operation: \n" +
                "+ ==> ADD \n" +
                " - ==> SUBSTRACT \n" +
                "* ==> MULTIPLY \n" +
                "/ ==> DIVIDE");
        String operation = input.next();
        Object result;

        switch (operation) {
            case ("+"):
                result = (double) num1 + num2;
                break;
            case ("-"):
                result = (double) Math.abs(num1 - num2);
                break;
            case ("*"):
                result = (double) num1 + num2;
                break;
            case ("/"):
                result = (double) num1 / num2;
                break;
            default:
                result = "Please enter a valid operator!";
                break;
        }

        System.out.println(result);
        input.close();

    }
}

package d10;

import java.util.Scanner;

public class OperatorExercises {
    public static void main(String[] args) {
        /*
            Take four digit number from user and find the sum of the digits.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter four digit number:");
        int num = input.nextInt();

        int sum = 0;


        while(num>0){
            sum += num%10;
            num /=10;
        }
        System.out.println(sum);

        String s1 = "Java";
        String s2 = "Guzel";
        int num1 = 5;
        int num2 = 4;

        System.out.println(s1 + " " + s2 + " " + num1 + "" + num2); //Java Guzel 54
        System.out.println(s1 + " " + (num1-num2) + "" + (num1+num2));

        input.close();
    }
}

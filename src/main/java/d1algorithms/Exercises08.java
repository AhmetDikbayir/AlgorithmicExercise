package d1algorithms;

import java.util.Scanner;

public class Exercises08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String pwd = input.nextLine();
        boolean isUpperCase = pwd.replaceAll("[^A-Z]","").length()>0;

        boolean isLowerCase = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean isDigit = pwd.replaceAll("[^0-9]", "").length()>0;

        boolean isSymbol = pwd.replaceAll("[a-zA-Z_0-9]", "").length()>0;

        System.out.println(isSymbol);
/*
        if(isDigit && isLowerCase && isUpperCase){
            System.out.println("Your password extremely strong!!");
        } else if (isDigit && isUpperCase) {
            System.out.println("Your password is strong!");
        } else if (isDigit && isLowerCase) {
            System.out.println("Your password is strong!");
        } else if (isLowerCase && isUpperCase) {
            System.out.println("Your password is strong!");
        }else if (isDigit) {
            System.out.println("Your password is weak!");
        } else if (isUpperCase) {
            System.out.println("Your password is weak!");
        } else if (isLowerCase) {
            System.out.println("Your password is weak!");
        }
 */
    }
}

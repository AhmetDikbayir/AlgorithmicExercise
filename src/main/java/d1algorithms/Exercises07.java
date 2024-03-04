package d1algorithms;

import java.util.Scanner;

public class Exercises07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String pwd = input.nextLine();
        int pwdLength = pwd.replaceAll(" ", "").length();
        System.out.println(pwdLength);
    }
}

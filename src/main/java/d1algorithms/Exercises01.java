package d1algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises01 {
    public static void main(String[] args) {
        //Get a name from user and write the name in reverse

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();

        for (int i = name.length()-1; i > 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}

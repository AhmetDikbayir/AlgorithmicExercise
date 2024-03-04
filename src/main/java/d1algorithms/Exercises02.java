package d1algorithms;

import java.util.Scanner;

public class Exercises02 {
    public static void main(String[] args) {
        //Find the vowel and constant character in the name

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String fullName = scan.nextLine();
        int vowelCounter = 0;

        String lowerCaseFullName = fullName.toLowerCase();
        System.out.println(lowerCaseFullName);
        for (int i = 0; i < fullName.length()-1; i++) {
            char c = lowerCaseFullName.charAt(i);
            if (c =='a' || c == 'e' || c == 'ı' || c == 'i' || c == 'o' || c == 'ö' || c == 'u' || c == 'ü') {
                vowelCounter++;
            }
        }
        System.out.println("Your name has " + vowelCounter + " piece  vowel character.");
        System.out.println("Your name has " + (fullName.length()-vowelCounter)+ " piece  constant character.");

    }
}

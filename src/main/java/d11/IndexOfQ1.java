package d11;

import java.util.Scanner;

public class IndexOfQ1 {
    public static void main(String[] args) {
        /*
                Ask the user for a sentence and then ask for a letter.
                Write a code that checks whether this letter is in the sentence or not
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String str = input.nextLine().toLowerCase();

        System.out.println("Please enter a letter for checking whether it contains sentence:");
        char chr = input.next().toLowerCase().charAt(0);

        boolean isContains = false;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == chr){
                isContains = true;
            }
        }
        System.out.println(isContains);
    }
}

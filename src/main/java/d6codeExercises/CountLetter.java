package d6codeExercises;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner input = new Scanner(System.in);
        String ch;
        System.out.println("Please enter a sentence:");
        String sentence = input.nextLine().toLowerCase();

        while (true){
            System.out.println("Please enter a letter:");
            ch = input.next().toLowerCase();
            if(ch.length() != 1){
                System.out.println("Please enter just a letter!");
            }else {
                break;
            }
        }

        char chr = ch.charAt(0);
        int counter = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == chr){
                counter++;
            }
        }

        System.out.println("Your sentence has " + counter + " times " + ch + " letter.");
    }
}

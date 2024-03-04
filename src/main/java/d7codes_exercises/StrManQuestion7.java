package d7codes_exercises;

import java.util.Scanner;

public class StrManQuestion7 {
    public static void main(String[] args) {
        //Soru-7: Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir,
        //            ternary kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
        //            Test data: ali eme all

        Scanner input = new Scanner(System.in);
        String word = " ";
        while (true) {
            System.out.println("Please enter 3 character words:");
            word = input.next();
            if (word.length() != 3) {
                System.out.println("Warning: You did not enter 3 character!!");
            } else {
                break;
            }
        }

        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.indexOf(i) == word.lastIndexOf(i)) {
                counter++;
            }
        }

        if (counter != 0){
            System.out.println("This word has the same character.");
        }else {
            System.out.println("This word has unique character.");
        }

        input.close();

    }
}

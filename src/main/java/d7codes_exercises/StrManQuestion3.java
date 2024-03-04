package d7codes_exercises;

import java.util.Scanner;

public class StrManQuestion3 {
    public static void main(String[] args) {
        //Soru-3: Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
        //            Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

        Scanner input = new Scanner(System.in);
        int blanks = 0;
        String str;
        while (true) {
            System.out.println("Please enter 3 words:");
            str = input.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    blanks++;
                }
            }
            if(blanks != 2) {
                System.out.println("Please enter just 3 words. No more or No less..");
            }
            else{
                break;
            }
        }

        char firstChar = str.split(" ")[0].toUpperCase().charAt(0);
        char secondChar = str.split(" ")[1].toUpperCase().charAt(0);
        char thirdChar = str.split(" ")[2].toUpperCase().charAt(0);

        System.out.println(firstChar + "." + secondChar + "." + thirdChar + ".");

        input.close();

    }
}

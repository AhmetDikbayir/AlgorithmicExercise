package willAsk;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        //        Soru-7: Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada hatali giris seklinde code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a character:");
        char chr = input.next().toLowerCase().charAt(0);

        if(Character.isUpperCase(chr)){
            System.out.println("You entered a Upper Case Value.");
        } else if (Character.isLowerCase(chr)) {
            System.out.println("You entered a Lower Case Value.");
        }else {
            System.out.println("You entered an incorrect value.");
        }

        //Başka bir yolu var mı?
    }
}

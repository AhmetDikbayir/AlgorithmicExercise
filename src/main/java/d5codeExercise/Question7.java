package d5codeExercise;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        //        Soru-7: Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada hatali giris seklinde code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a character:");
        char chr = input.next().toLowerCase().charAt(0);

        char[] vowelArr = {'a', 'e', 'i', 'ı', 'o', 'u', 'ü', 'ö'};
        boolean vowel = false;

        if((chr>= 'A' && chr <= 'Z') || (chr>= 'a' && chr<= 'z')){

            for(int i = 0; i < vowelArr.length; i++){
                if(vowelArr[i] == chr){
                    vowel = true;
                }
                else {
                    continue;
                }
            }
            if(vowel){
                System.out.println("VOWEL");
            }else {
                System.out.println("CONSO");
            }
        }else{
            System.out.println("Please enter a valid character.");
        }

        /*
        if(Character.isUpperCase(chr)){
            System.out.println("You entered a Upper Case Value.");
        } else if (Character.isLowerCase(chr)) {
            System.out.println("You entered a Lower Case Value.");
        }else {
            System.out.println("You entered an incorrect value.");
        }

         */

    }
}

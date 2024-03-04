package d6codeExercises;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
//        Soru-18:Kullanicidan bir character girmesini isteyiniz
//        Character harf ise kucuk harf olup olmadigini kontrol ediniz
//        Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
//        Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
//        Harf degilse ekrana "Harf degil" yazdiriniz
//        97:a  122:z ascii değeri

        Scanner input = new Scanner(System.in);
        String character;


        while (true){
            System.out.println("Please enter one character: ");
             character = input.next();
             if(character.length()>1 || character.length()<1){
                 System.out.println("Please enter valid character!!");
             }else {
                 break;
             }
        }

        char firstChar = character.charAt(0);

        if(firstChar>96 && firstChar<123){
            System.out.println("It is a lowercase character.");
        } else if (firstChar>64 && firstChar<91) {
            System.out.println("It is an uppercase character.");
        }else {
            System.out.println("It is not a letter.");
        }
        input.close();
    }
}

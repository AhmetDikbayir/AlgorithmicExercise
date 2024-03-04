package d5codeExercise;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
//        Soru-8: Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
//                Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
//        Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapan code create ediniz

        Scanner input = new Scanner(System.in);
        int loyaltyCrd = 0;
        int products = 0;
        double productPrice = 0;
        while (true) {
            System.out.println("Do you have a loyalty card? (1. Yes 2. No)");
            loyaltyCrd = input.nextInt();
            System.out.println("Please enter your products you have bought:");
            products = input.nextInt();
            System.out.println("Please enter your product price:");
            productPrice = input.nextDouble();
            if (loyaltyCrd != 1 && loyaltyCrd != 2 && products<0 && productPrice<=0) {
                System.out.println("Please enter valid option!");
            } else {
                break;
            }
        }

        if(loyaltyCrd == 1 && products<10){
            System.out.println("You got " + (productPrice*0.15) + " discount!");
        } else if(loyaltyCrd ==1 && products>9){
            System.out.println("You got " + (productPrice*0.20) + " discount");
        } else if (loyaltyCrd ==2 && products<10) {
            System.out.println("You got " + (productPrice * 0.10));
        } else if ( loyaltyCrd ==2 && products>9) {
            System.out.println("You got " + (productPrice*0.15) + " discount!");
        }
        input.close();
    }
}

package d1algorithms;

import java.util.Scanner;

public class TechProPractice02 {
    public static void main(String[] args) {
        /*
        1. Kullanıcıdan iki sayı alın:
        2. Ternary kullanarak,
            - Sayılar birbirine eşit ise konsola "Sayılar birbirine eşit" yazdırın.
            - Sayılar birbirine eşit değilse büyük olan sayının karesini ekrana yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        int sayi1 = input.nextInt();
        System.out.println("Birinci sayıyı giriniz:");
        int sayi2 = input.nextInt();
        Object result = (sayi1 == sayi2) ? ("Sayılar birbirine eşit."): ((sayi1 >sayi2) ? (sayi1*sayi1): (sayi2*sayi2)) ;
        System.out.println(result);
    }
}

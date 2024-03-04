package d5codeExercise;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Soru-1: Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islemden biri ile isleme koyup sonucun yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci syaıyı giriniz:");
        double sayi1 = input.nextInt();
        System.out.println("Lütfen ikinci syaıyı giriniz:");
        double sayi2 = input.nextInt();
        int islem;
        int sonuc = 0;

        while(true) {
            System.out.println("Lütfen bir işlem seçiniz:  " +
                    "\n 1. Toplama" +
                    "\n 2. Çıkarma" +
                    "\n 3. Çarpma" +
                    "\n 4. Bölme");
            islem = input.nextInt();
            if (islem > 0 && islem < 5) {
                break; // Geçerli bir seçim yapıldığında döngüyü kır
            } else {
                System.out.println("Geçersiz bir seçim yaptınız. Lütfen 1 ile 4 arasında bir sayı girin.");
            }
        }

        switch (islem){
            case 1:
                System.out.println("Girdiğiniz sayıların toplamı: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Girdiğiniz sayıların farkı: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Girdiğiniz sayıların çarpımıı: " + (sayi1 * sayi2));
                break;
            case 4:
                if(sayi2 != 0){
                    System.out.println("Girdiğiniz sayıların bölümü: " + (sayi1 / sayi2));
                    break;
                }else{
                    System.out.println("Bölen 0 olamaz!");
                    break;
                }
        }

        input.close();
    }
}

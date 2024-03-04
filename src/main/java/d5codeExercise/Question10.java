package d5codeExercise;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        //Soru-10:Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner input = new Scanner(System.in);
        int num = 0;
        String readiness = "";
        while(true){
            System.out.println("Please enter three digit number: ");
            num = input.nextInt();
            if(num<1000 && num>99){
                break;
            }else {
                System.out.println("Please enter valid number!!");
            }
        }
        int hundred = num/100;
        num %=100;
        int tens = num/10;
        int ones = num %=10;

        switch (hundred){
            case 1:
                readiness+="Yüz";
                break;
            case 2:
                readiness+="İki yüz";
                break;
            case 3:
                readiness+= "Üç yüz";
                break;
            case 4:
                readiness+= "Dört yüz";
                break;
            case 5:
                readiness+= "Beş yüz";
                break;
            case 6:
                readiness+= "Altı yüz";
                break;
            case 7:
                readiness+= "Yedi yüz";
                break;
            case 8:
                readiness+= "Sekiz yüz";
                break;
            case 9:
                readiness+= "Dokuz yüz";
                break;
        }
        switch (tens){
            case 1:
                readiness+=" on";
                break;
            case 2:
                readiness+="yirmi";
                break;
            case 3:
                readiness+= " otuz";
                break;
            case 4:
                readiness+= " kırk";
                break;
            case 5:
                readiness+= " elli";
                break;
            case 6:
                readiness+= " altmış";
                break;
            case 7:
                readiness+= " yetmiş";
                break;
            case 8:
                readiness+= " seksen";
                break;
            case 9:
                readiness+= " doksan";
                break;
        }
        switch (ones){
            case 1:
                readiness += " bir";
                break;
            case 2:
                readiness+= " iki";
                break;
            case 3:
                readiness+= " üç";
                break;
            case 4:
                readiness+= " dört";
                break;
            case 5:
                readiness+= " beş";
                break;
            case 6:
                readiness+= " altı";
                break;
            case 7:
                readiness+= " yedi";
                break;
            case 8:
                readiness+= " sekiz";
                break;
            case 9:
                readiness+= " dokuz";
                break;
        }
        System.out.println(readiness);
        input.close();
    }
}

package d5codeExercise;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //        Soru-3: Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
        //        INFO : BMI = kilo(kg) /(boy*boy)(m)
        //                BMI <=20 oldukca zayifsiniz
        //        20<BMI<=25 Normal sinirlardasiniz
        //        25<BMI<=30 Sisman kategorisindesiniz
        //        30<BMI ==> Obez grubundasiniz.

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height: (type of centimeter)");
        int height = input.nextInt();
        double heightMeter = height/100;
        System.out.print("Please enter your weight:");
        double weight = input.nextDouble();

        double bmi = weight / (heightMeter * heightMeter);

        if(bmi<21){
            System.out.println("You are so weak!");
        } else if (bmi>20 && bmi<26) {
            System.out.println("You are normal. Go on like this!");
        } else if (bmi>25 && bmi<31) {
            System.out.println("You are fat. Be careful!!");
        } else {
            System.out.println("You are Obes. You should not eat too much!!!");
        }
        input.close();
    }
}

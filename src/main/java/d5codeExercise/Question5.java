package d5codeExercise;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
//        Soru-5: Kullanicidan  yasini ve kilosunu aliniz
//        18 yasindan kucuk ise kan bagisi yapamaz
//        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
//        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Please enter your weight: ");
        int weight = input.nextInt();

        if(age>18){
            if(weight>50){
            System.out.println("You can donate Thanks...");
        }else{
                System.out.println("You cannot donating blood...");
            }
        } else{
            System.out.println("You cannot donating blood...");
        }
        input.close();
    }
}

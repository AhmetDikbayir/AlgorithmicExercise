package d5codeExercise;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
//        Soru-15:Katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.
//        ax^2 + bx + c;
//        Çözüm adımları-->kullanıcıdan a,b,c yi okutun.
//        Delta = bb - 4ac
//        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
//        Delta = 0 => 1 tane kök vardır x = -b/2a
//        Delta < 0 ise kök yoktur.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the constant of the quadratic equation: \n" +
                "ax^2 + bx +c = 0");
        System.out.println("Enter the a:");
        int a = input.nextInt();
        System.out.println("Enter the b:");
        int b = input.nextInt();
        System.out.println("Enter the c:");
        int c = input.nextInt();

        double delta = (b*b) - (4*a*c);
        if(delta>0){
            System.out.println("This equation has two different roots.");
        } else if (delta == 0) {
            System.out.println("This equation has one different roots.");
        }else {
            System.out.println("Unfortunately this equation does not have real roots...");
        }
    }
}

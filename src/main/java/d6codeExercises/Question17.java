package d6codeExercises;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
//        Soru-17:Kullanicidan bir sayi aliniz
//        Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
//        10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
//                Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        Scanner input = new Scanner(System.in);
        String number;
        while(true){
            System.out.println("Please enter a number: ");
            number = input.next();

            if(number.matches("-?\\d+(\\.\\d+)?")){
                break;
            }else {
                System.out.println("You entered invalid value!!");
            }
        }
        int number1 = Integer.parseInt(number);

        if(number1>-1){
            if(number1>9){
                System.out.println("You entered a positive number.");
            }else{
                System.out.println("You entered a digit.");
            }
        }else{
            System.out.println("You entered a negative number.");
        }

        input.close();
    }
}

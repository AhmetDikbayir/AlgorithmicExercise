package d8codes_exercises;

import java.util.Scanner;

public class TernaryQ3 {
    public static void main(String[] args) {
        //Soru-17:Kullanicidan bir sayi aliniz
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

        System.out.println((number1>-1) ?
                (number1>9) ? "You entered a positive number." : "You entered a digit." : "You entered a negative number.");

        input.close();
    }
}

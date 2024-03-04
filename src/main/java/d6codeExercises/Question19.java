package d6codeExercises;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
//        Soru-19:Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
//        3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
//                Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.

        Scanner input = new Scanner(System.in);
        String number;

        while(true){
            System.out.println("Please enter a positive number: ");
            number = input.next();

            if(number.matches("-?\\d+(\\.\\d+)?")){
                break;
            }else {
                System.out.println("You entered invalid value!!");
            }
        }
        int number1 = Integer.parseInt(number);

        if(number1>99 && number1<1000){
            System.out.println("It is a 3-digit number.");
        }else {
            if(number1 % 2 == 0){
                System.out.println("It is an even but not 3-digit number.");
            }else {
                System.out.println("It is an odd but not 3-digit number.");
            }
        }
        input.close();
    }
}

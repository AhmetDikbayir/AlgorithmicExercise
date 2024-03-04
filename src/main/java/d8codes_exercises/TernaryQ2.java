package d8codes_exercises;

import java.util.Scanner;

public class TernaryQ2 {
    public static void main(String[] args) {
        //SORU 2
        /*
                Veri tipi int olan number verildiğinde, number  çift mi tek mi kontrol et

                Eğer number çift ise  print true

                Eğer number tek ise  print false

                result true ya da false olmalı.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();

        System.out.println(num % 2 == 0);
        input.close();
    }
}

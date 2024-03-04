package d7codes_exercises;

import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        /*
         Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
         0-1-1-2-3-5-8-13-21-34....
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number for seeing fibonacci number until there:");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;

        //0-1-1-2

        System.out.print(a + " - " + b + " - ");
        for(int i = 0; i<num; i++){
            c = a+b;
            a = b;
            b = c;
            System.out.print( b + " - ");
        }
    }
}

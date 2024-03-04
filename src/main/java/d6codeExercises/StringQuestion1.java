package d6codeExercises;

import java.util.Scanner;

public class StringQuestion1 {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String str = input.next();

        System.out.println("Please enter a number:");
        int number = input.nextInt();

        if(str.length() == 0){
            System.out.println("");
        }else if(str.length()>1){
            char firstCh = str.charAt(0);
            char lastCh = str.charAt(str.length()-1);
            for(int i =0; i<number; i++){
                System.out.print("" + firstCh+lastCh);
            }
        }
        input.close();
    }
}

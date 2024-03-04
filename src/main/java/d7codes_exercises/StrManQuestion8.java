package d7codes_exercises;

import java.util.Scanner;

public class StrManQuestion8 {
    public static void main(String[] args) {
        //Soru-8: Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
        //            iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
        //            ornek:
        //            input = Ali
        //            output = lilili
        //            input = el
        //            output = el

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String str = input.next();

        String lastTwoChar = " ";

        if(str.length()>2){
            lastTwoChar = str.substring(str.length()-2);
            System.out.println(lastTwoChar + lastTwoChar + lastTwoChar);
        }else {
            System.out.println(str);
        }

        input.close();
    }
}

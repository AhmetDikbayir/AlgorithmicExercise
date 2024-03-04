package d7codes_exercises;

import java.util.Scanner;

public class StrManQuestion9 {
    public static void main(String[] args) {
        //Soru-9: StringMethods:
        //				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
        //	    	    ORNEK:
        //		     	INPUT      :  Python
        //				OUTPUT :   Pyt

        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Please enter an even characters:");
            String str = input.next();

            int lastIndex = (str.length()/2);

            if (str.length() % 2 == 0){
                String firstPart = str.substring(0,lastIndex);
                System.out.println(firstPart);
                break;
            }else {
                System.out.println("You did not enter an even characters...");
            }
        }

        input.close();
    }
}

package d7codes_exercises;

import java.util.Scanner;

public class StrManQuestion4 {
    public static void main(String[] args){
        //Soru-4: Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Please foru character: ");
        String str = input.next();
        String newStr = "";
        int index = 0;
        for(int i = str.length()-1; i>-1;i--){
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }
}

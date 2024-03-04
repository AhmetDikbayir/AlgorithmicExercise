package d8codes_exercises;

import java.util.Scanner;

public class CamelCaseQuestion {
    public static void main(String[] args) {
        /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any sentence: ");
        String sentence = input.nextLine();
                //"I lIVe in uSa";

        for(int i = 0; i<sentence.split(" ").length; i++){
            String firstLetter = sentence.split(" ")[i].substring(0,1).toUpperCase();
            String remainOfWord =sentence.split(" ")[i].substring(1).toLowerCase();
            String newWord = firstLetter+remainOfWord;
            if(newWord.substring(0,1).equals("İ")){
                    newWord = newWord.replace("İ", "I");
            }
            System.out.print(newWord + " ");
        }
        input.close();
    }
}

package d8codes_exercises;

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any sentence: ");
        String sentence = input.nextLine();
        String firstWord = "";
        int i = 0;
        ArrayList<String> words = new ArrayList<>();
        String longestWord = " ";
        while(i<sentence.split(" ").length){
            firstWord = sentence.replaceAll("\\p{Punct}", "").split(" ")[i];
            words.add(firstWord);
            i++;

            for(String w : words){
                if(w.length()>longestWord.length()){
                    longestWord = w;
                }
            }

        }
        System.out.println(longestWord);

    }
}

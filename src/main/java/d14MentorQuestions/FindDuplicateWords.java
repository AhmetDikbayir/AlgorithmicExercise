package d14MentorQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class FindDuplicateWords {
    public static void main(String[] args) {
        //4)  Java Program to Find Duplicate Words in a String
        findDuplicateWords("Hel;lo kdkd hello");
    }

    public static void findDuplicateWords(String str){
        String[] words = str.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");
        HashMap<String, Integer> myWords = new HashMap<>();
        int counter = 0;
        for(String w : words){
            for(int i = 0; i<words.length;i++){
                if(words[i].equalsIgnoreCase(w)){
                    counter++;
                }
            }

            myWords.put(w,counter);
            counter = 0;
        }
        System.out.println(myWords);
    }



}

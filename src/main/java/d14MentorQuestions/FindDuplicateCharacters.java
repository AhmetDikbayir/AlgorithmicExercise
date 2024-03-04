package d14MentorQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicateCharacters {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence for counting the letters: ");
        String str = scan.nextLine();
        findDuplicateChar(str);
    }

    public static void findDuplicateChar(String str){
        String[] letters = str.replaceAll(" ", "").split("");
        HashMap<String, Integer> duplicateChar = new HashMap<>();
        int counter = 0;
        for( String w : letters){
            for(int i = 0;i<str.length();i++){
                if(String.valueOf(str.charAt(i)).equals(w)){
                    counter++;
                }
            }
            duplicateChar.put(w, counter);
            counter=0;
        }
        System.out.println(duplicateChar);

    }
}

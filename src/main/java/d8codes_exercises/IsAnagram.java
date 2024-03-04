package d8codes_exercises;

import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        /*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "Silent") ==> true
		 */

        System.out.println(isAnagram("listen", "silent"));


    }

    public static Boolean isAnagram(String firstWord, String secondWord){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first word: ");
        firstWord = input.next();
        System.out.println("Please enter second word: ");
        secondWord = input.next();
        int counter = 0;

        for(int i = 0; i< firstWord.length(); i++) {
            for (int j = 0; j < secondWord.length(); j++) {
                if (secondWord.charAt(j) == firstWord.charAt(i)) {
                    counter++;
                }
            }
        }
        return (counter == firstWord.length());
    }
}

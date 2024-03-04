package d11;

import java.util.Scanner;

public class IndexOfQ2 {
    public static void main(String[] args) {

        /*

            Ask the user for a sentence and a word. Based on the usage of the word in the sentence, print one of the following three sentences:

            The entered word is not used in the sentence.
            The entered word is used once in the sentence.
            The entered word is used more than once in the sentence
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String sentence = input.nextLine().toLowerCase();

        System.out.println("Please enter a letter for checking whether it contains sentence:");
        String word = input.next().toLowerCase();

        int counter = 0;
        for(String w : sentence.split(" ")){
            if(w.equals(word)){
                counter++;
            }
        }

        if(counter ==0){
            System.out.println("The word did not use in the sentence.");
        } else if (counter == 1) {
            System.out.println("The word used once time in the sentence.");
        }else{
            System.out.println("The word used more than once in the sentence.");
        }
    }
}

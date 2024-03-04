package d14MentorQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {

        //1) Java Program to Find the First Non-repeated Character in a String
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word for finding non repeated first character: ");
        String str = scan.nextLine();
        char ch = findFirstNonRepeatingChar(str);
        System.out.println(ch);
        scan.close();

    }

    public static char findFirstNonRepeatingChar(String str) {
        char nonRep=0;
       for(int i =0; i< str.length() ; i++){
           if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
               nonRep = str.charAt(i);
               break;
           }
       }
       return nonRep;
    }


}

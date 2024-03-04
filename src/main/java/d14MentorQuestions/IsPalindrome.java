package d14MentorQuestions;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {

        //2)  Java Program to Check Palindrome String
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word for checking whether it is a palindrome or not: ");
        String str = scan.next();
        isPalindrome(str);

        scan.close();

    }

    public static void isPalindrome(String str){
        String reversed= "";
        for(int  i = str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Nooo");
        }
    }
}

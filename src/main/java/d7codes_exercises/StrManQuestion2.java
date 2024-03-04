package d7codes_exercises;

import java.util.Scanner;

public class StrManQuestion2 {
    public static void main(String[] args) {
        //Soru-2: Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        //            ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first and last name:");
        String fullName = input.nextLine();



        int index = 0;

        for (int i = 0; i<fullName.length(); i++){
            if(fullName.charAt(i) == ' '){
                index++;
            }
        }
        String fristName = fullName.split(" ")[0];
        String lastName = fullName.split(" ")[index];

        System.out.println("Your first name is " + fristName + " your lastname is " + lastName);

        input.close();
    }
}

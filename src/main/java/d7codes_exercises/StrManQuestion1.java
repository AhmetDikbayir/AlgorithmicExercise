package d7codes_exercises;

import java.util.Scanner;

public class StrManQuestion1 {
    public static void main(String[] args){
        //Soru-1: Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter something:");
        String str = input.nextLine();

        if(str.contains(" ")){
            System.out.println("This input contains BLANK!!");
        }else {
            System.out.println("There is not blank...");
        }
        input.close();
    }
}

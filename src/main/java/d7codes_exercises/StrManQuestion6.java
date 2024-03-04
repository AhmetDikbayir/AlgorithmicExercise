package d7codes_exercises;

import java.util.Scanner;

public class StrManQuestion6 {
    public static void main(String[] args) {
        //Soru-6: Kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        //            örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your e-mail:");
        String email = input.next();

        if(email.contains("hotmail")){
            email = email.replace("hotmail", "gmail");
        }
        System.out.println(email);
        input.close();
    }
}

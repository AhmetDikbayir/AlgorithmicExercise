package d8codes_exercises;

import java.util.Scanner;

public class StrManQ12 {
    public static void main(String[] args) {
        //Soru-12: Kullanicidan email girmesini isteyin
        //             @ isareti icermiyorsa "gecerli bir email girin" yazdirin
        //             @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
        //             @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
        //             ORNEK:
        //            INPUT : techproed.com OUTPUT : "gecerli bir email girin "
        //            INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
        //            INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"

        Scanner input = new Scanner(System.in);


        while (true){
            System.out.println("Please enter your gmail address:");
            String email = input.next();
            if(!email.contains("@")){
                System.out.println("Please enter valid e-mail address!!");
            }else{
                if(!email.contains("gmail")){
                    System.out.println("Please enter your gmail address!!");
                }else {
                    System.out.println("Email is approved.");
                    break;
                }
            }
        }
        input.close();
    }
}

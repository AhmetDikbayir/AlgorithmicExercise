package d5codeExercise;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
//        Soru-9: Kulanıcıdan aracının hızını alınız.Trafik cezasının değerini hesaplayın. 54 hız sınırıdır.
//        Eğer hızınız 55-74 arasında ise:Ceza 100 $'dır.
//        Eğer hızınız 75 - 84 arasında ise:Ceza 150 $'dır.
//        Eğer hızınız 85 -94 arasında ise:Ceza 320 $'dır.
//        Eğer hızınız 94'den daha fazla ise: Ceza 500 $'dır.
//                ve ayrıca,
//        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
//        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
//        Örn;
//        currentSpeed(Hızınız) 87
//        ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;  sonuç 320 olmalıdır.
//                currentSpeed(Hızınız) 65
//        ve isDriverLicenceAvailable(Ehliyeti var mı?) = false; sonuç 300 olmalıdır.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your speed:");
        int speed = input.nextInt();
        System.out.println("Do you have driver licence? (1. Yes 2. No)");
        int isDriverLicence = input.nextInt();

        int punishment = 0;

        if(isDriverLicence==1){
            if(speed>54 && speed<75){
                punishment = 100;
            } else if (speed>74 && speed<85) {
                punishment = 150;
            } else if (speed>84 && speed<95) {
                punishment = 320;
            } else if (speed>94) {
                punishment = 500;
            }
        }else{
            if(speed>54 && speed<75){
                punishment = 300;
            } else if (speed>74 && speed<85) {
                punishment = 350;
            } else if (speed>84 && speed<95) {
                punishment = 620;
            } else if (speed>94) {
                punishment = 800;
            }
        }

        System.out.println("Your punishment is $" + punishment);

        input.close();

    }
}

package d6codeExercises;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
//        Soru-20:Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
//		          -> 0(dahil) ile 50 arasi - D
//                -> 50(dahil) ile 60 arası - C
//                -> 60(dahil) ile 80 arası - B
//                -> 80(dahil) ustu- A
//        Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
//
//                *** IPUCU--> switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
//        switch() de int, byte, short, char, String kullanilir.

        Scanner input = new Scanner(System.in);
        int note;
        while (true){
            System.out.println("Please enter your note:");
            note = input.nextInt();

            if(note<101 && note>-1){
                break;
            }
            else {
                System.out.println("Please enter your valid note:");
            }
        }

        //Can I solve this problem using Switch-case?
        if(note<50){
            System.out.println("D");
        }else if(note<60){
            System.out.println("C");
        }else if(note<80){
            System.out.println("B");
        }else {
            System.out.println("A");
        }

        input.close();

    }
}

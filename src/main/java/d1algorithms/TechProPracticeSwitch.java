package d1algorithms;

import java.util.Scanner;

public class TechProPracticeSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 0 to 4:");
        double score = input.nextDouble();
        String result = "";

        //Bu senaryoda ilk durumda switch kullanılamıyor çünkü switch de karşılaştırma yapılamıyor.
        if(score<1){
            result = "KALDI";
        } else if (score < 2) {
            result = "GEÇTİ";
        } else if (score < 2.5) {
            result = "İYİ";
        } else if (score < 3.5) {
            result = "UST";
        } else if (score < 4) {
            result = "HARİKA";
        }else {
            result = "Please enter the correct Note";
        }

        switch (result){
            case "KALDI":
                System.out.println("F");
                break;
            case "GEÇTİ":
                System.out.println("D");
                break;
            case "İYİ":
                System.out.println("C");
                break;
            case "UST":
                System.out.println("B");
                break;
            case "HARİKA":
                System.out.println("A");
                break;
//            default:
//                System.out.println("Something went wrong!");
        }
    }
}

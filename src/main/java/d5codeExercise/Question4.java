package d5codeExercise;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Soru-4: Kullanicidan IT alanini bilgisini alarak console'a  meslegi için;
        //qa ==> Quality Analyst
        //dev ==> Developer
        //ba ==> Busines Analyst
        //pm ==> Project Manager
        //seklinde bilgilerini yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your job: \n" +
                "qa \n" +
                "dev \n" +
                "ba\n" +
                "pm");
        String job = input.next();
        job = job.toLowerCase();

        if(job.equals("qa")){
            System.out.println("You are Quality Analyst.");
        } else if (job.equals("dev")) {
            System.out.println("You are Developer.");
        } else if (job.equals("ba")) {
            System.out.println("You are Business Analyst.");
        } else if (job.equals("pm")) {
            System.out.println("You are Project Manager.");
        }

        input.close();
    }
}

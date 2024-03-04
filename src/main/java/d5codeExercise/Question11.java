package d5codeExercise;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        //Soru-11:Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.(pazartesi hafta başlangıcı)
        Scanner scanner = new Scanner(System.in);
        byte currentDay = 0;
        String comingDay = "";
        while (true) {
            System.out.println("Please choose your day name: \n" +
                    "1. Monday\n" +
                    "2. Tuesday\n" +
                    "3. Wednesday\n" +
                    "4. Thursday\n" +
                    "5. Friday\n" +
                    "6. Saturday\n" +
                    "7. Sunday");
            currentDay = scanner.nextByte();
            if (currentDay > 0 && currentDay < 8) {
                break;
            } else {
                System.out.println("Please choose a valid day number!");
            }
        }

        switch (currentDay) {
            case 1:
                comingDay = "Wednesday.";
                break;
            case 2:
                comingDay = "Thursday.";
                break;
            case 3:
                comingDay = "Friday.";
                break;
            case 4:
                comingDay = "Saturday.";
                break;
            case 5:
                comingDay = "Sunday.";
                break;
            case 6:
                comingDay = "Monday.";
                break;
            case 7:
                comingDay = "Tuesday.";
                break;
        }

        System.out.println("After 100 days you will be on " + comingDay);
        scanner.close();
    }
}

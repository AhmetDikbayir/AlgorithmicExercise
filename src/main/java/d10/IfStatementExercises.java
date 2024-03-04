package d10;

import javax.swing.*;
import java.util.Scanner;

public class IfStatementExercises {
    public static void main(String[] args) {
        /*
                User enter a letter then write days name starts with this character
         */
        Scanner input = new Scanner(System.in);
        /*
        String ch;
        while (true){
            System.out.println("Please enter a letter for seeing which starts with this letter:");
            ch = input.next().toLowerCase();
            if(ch.replaceAll("[^a-z]", "").length()!=1){
                System.out.println("Please enter just a letter!");
            }else{
                break;
            }
        }

        switch(ch){
            case("m"):
                System.out.println("MONDAY");
                break;
            case("t"):
                System.out.println("TUESDAY - THURSDAY");
                break;
            case("w"):
                System.out.println("WEDNESDAY");
                break;
            case("f"):
                System.out.println("FRIDAY");
                break;
            case ("s"):
                System.out.println("SATURDAY - SUNDAY");
                break;
            default:
                System.out.println("There is not any day start with this letter.");
                break;
        }*/

        /*
                Write a day weekday or weekend
         */


        System.out.println("Please enter a day:");
        String day = input.next().toLowerCase();

        String[] hIci = {"monday", "tuesday", "wednesday", "thursday", "friday"};
        String[] hSonu = {"saturday", "sunday"};

        String str = "monday";
        String str2 = "ond";
        System.out.println(str.contains(str2));

        /*

        String[][] days = {{"monday", "tuesday", "wednesday", "thursday", "friday"},{"saturday", "sunday"}};
        int result = 0;

        for(String[] m : days){
            for(String k : m){
                if(m == days[0] && day.equals(k)) {
                    result =1;
                }else if(m==days[1] && day.equals(k)){
                    result = 2;
                }
            }
        }
        if(result == 1){
            System.out.println("WEEKDAY!!");
        } else if (result == 2) {
            System.out.println("WEEKEND!!");
        }else {
            System.out.println("It is not a day");
        }

         */



        /*
            Check the rectangle is a swuare or not!
         */
        /*
        System.out.println("Please enter the short side of the rectangle:");
        double shortSide = input.nextDouble();
        System.out.println("Please enter the long side of the rectangle:");
        double longSide = input.nextDouble();

        System.out.println((shortSide == longSide) ? "It is a SQUARE!" : "It is a RECTANGLE");


         */
        /*
            Take an input from the user and check this if it is a day name or not!
            If it is not a dayname write "Please enter a valid dayname"
            If it is a dayname write 1 is upperCase -2 and 3 lowerCase character of the day.
         */
        /*

        System.out.println("Please enter a day name:");
        String dayName = input.next().toLowerCase();

        String[] daysName = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        boolean isDay=false;

        for(String w : daysName){
            if(dayName.equals(w)){
                isDay = true;
            }
        }
        if(isDay){
            System.out.println(dayName.toUpperCase().substring(0,1) + dayName.substring(1,3));
        }else {
            System.out.println("Please enter a valid dayname");
        }
        */

        /*
                User enter a password
                if password starts with UpperCase and 'A' ==> "Valid password"
                                         LowerCase and 'z' ==> "Valid password"
                                         other situation ==> "Invalid password"
                                         (Use nested if)
         */
        /*
        System.out.println("Please enter the password:");
        String pwd = input.nextLine();

        if(pwd.charAt(0)>64 && pwd.charAt(0)<91){
            if(pwd.charAt(0)==65){
                System.out.println("Valid password");
            }else{
                System.out.println("Invalid password");
            }

        } else if (pwd.charAt(0)>96 && pwd.charAt(0)<123) {
            if(pwd.charAt(0)==122){
                System.out.println("Valid password");
            }else {
                System.out.println("Invalid password");
            }
        }

         */

        /*
                Take four digit number from the user
                if this number is divisible by 5 and
                               ends with 0 ==> "An even number divisible by 5"
                                         5 ==> "An odd number divisible by 0"
                                         (Use Nested if)
         */
        /*
        while (true){
            System.out.println("Please enter a number divisble by 5:");
            int number = input.nextInt();
            if(number%5 ==0){
                if(number%10==0){
                    System.out.println("An even number divisible by 5");
                    break;
                }else if(number%10 == 5){
                    System.out.println("An odd number divisible by 0");
                    break;
                }
            }else {
                System.out.println("Try again!");
            }
        }

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ürün miktarını sayı olarak giriniz");
        int miktar = scan.nextInt();
        System.out.println("Ürün birim fiyatını giriniz");
        double fiyat = scan.nextDouble();
        double result = miktar>1000 ? fiyat*0.9*miktar : fiyat*miktar;
        System.out.println(result);
        char m = 'D';

        switch(m) {
            case 'A':
                System.out.println("First letter");
                break;
            case 'B':
                System.out.println("Second letter");
            case 'C':
                System.out.println("Third letter");
                break;
            case 'D':
                System.out.println("Fourth letter");
            default:
                System.out.println("What kind of letter is this?");
        }


        input.close();



//        int y = 1;
//        int z = 1;
//        int a = y<10? y++ : z++;
//        System.out.println(y + "," + z + "," + a); //2,1,1

//        int y = 12;
//        System.out.println((y > 5) ? (y < 10 ? y * 2 : y * 3) : (y > 10 ? 2 + y : 3 + y));

    }
}

package d1algorithms;

import java.util.Scanner;

public class NewExercise01 {
    public static void main(String[] args) {
        //lentgth()
        String s = "Merhaba Java";
        System.out.println(s.length());

        //char At()
        System.out.println(s.charAt(0));

        //substring()
        s.substring(3,5);
        System.out.println(s.substring(3,5));

        System.out.println(s.contains("ba Ja"));

        //"sarıkanarya" kelimesindeki a harfleri dışındaki bütün karakterleri * ile değiştirelim.
        String str = "sarıkanarya";
        String s2 = str.replaceAll("[^a]", "*");
        System.out.println(s2);
        System.out.println(str);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password:");
        String pwd = input.nextLine();
        boolean isSymbol = pwd.replaceAll("[a-zA-Z_0-9 ]","").length()>0;
        System.out.println(isSymbol);

    }
}

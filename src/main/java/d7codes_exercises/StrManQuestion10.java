package d7codes_exercises;

import java.util.Scanner;

public class StrManQuestion10 {
    public static void main(String[] args){
        //Soru-10: Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
        //            Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
        //            input : John White 1234234534561478
        //            output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.next();
        System.out.println("Please enter your name:");
        String lastName = input.next();
        System.out.println("Please enter your credit card numbers: ");
        String cardNum = input.next();
        String firstPart = name.substring(0,1).toUpperCase();
        String secondPart = name.substring(1).toLowerCase().replaceAll("[a-z]","*");
        name = firstPart + secondPart;
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase().replaceAll("[a-z]","*");
        cardNum = cardNum.substring(0, cardNum.length()-4).replaceAll("[0-9]", "*") + cardNum.substring(cardNum.length()-4);

        System.out.println("Name: " + name + " Lastname: " + lastName + " card name: " + cardNum);

        input.close();
    }
}

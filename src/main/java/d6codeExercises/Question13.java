package d6codeExercises;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
//        Soru-13:Seyahat Projesi-->Bulundugunuz yerden, bir yere yolculuk edeceksiniz.
//                A. Köln veya Frankfurta gidebilirsiniz.
//                B. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
//        İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
//                İşlemlerde direkt bunları cağırabilirsiniz.
//                todo İLK OLARAK;
//        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt :60KM---Köln:80 KM---(20 KM başına 5 euro bilet parası alınmaktadir..)yazısı gelsin.
//        1.Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
//        todo Frankfurt girildiyse,
//                örn: girdi= Frankfurt
//        case=FRANKFURT:
//        Rota = Frankfurt yazdırın.
//                Frankfurt km hesabı işlemi yapın. son olarak konsolda: Frankfurt 15 Euro yazsın.
//        todo case: KÖLN ise
//        "Rota = Köln" yazdırın. km hesabına göre işlemi yapınız.son olarak konsolda:  Köln   20 Euro yazsın.
//        2.Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):" sorusunu sorsun.
//        case:1 ise" 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.
//        case:2 ise "2 kişilik " yazdırın.2 kişi için bilet fiyatını hesaplayın.
//                todo  Son olarak yolculugunuzu check edin;
//        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
//        a.Bakiyemi belirtin.
//        b.Toplam Tutarı belirtin.
//                c.double paraUstu oluşturun ve hesaplayın.
//                d.Double para üstünü yazdırın.

        Scanner input = new Scanner(System.in);

        double sumPrice = 0;
        String destination;
        String dest1 = "FRANKFURT";
        String dest2 = "KÖLN";
        int frankfurtKm = 60;
        int kolnKm = 80;
        int unit = 20;
        int unitPrice = 5;
        int person = 0;

        double payment = 0;
        double changeBack = 0;


        while (true) {
            System.out.println("Where do you want to go?\n" +
                    " (Frankfurt :60KM---Köln:80 KM---(per 20 KM is 5€ ..)");
            destination = input.next().toUpperCase();
            if (destination.equals(dest1) || destination.equals(dest2)) {
                break;
            } else {
                System.out.println("Please enter valid destination");
            }
        }

        while (true) {
            System.out.println("How many people will travel? (Max: 2)");
            person = input.nextInt();
            if (person == 1 || person == 2) {
                break;
            } else {
                System.out.println("Please enter valid person number!");
            }
        }

        int frankfurtPrice = (frankfurtKm / unit) * unitPrice * person;
        int kolnPrice = (kolnKm / unit) * unitPrice * person;

        while (true) {
            System.out.println("Please enter your payment amount: ");
            payment = input.nextDouble();

            //Should I combine first and third condition with or in first condition?
            /*
            if ((destination.equals(dest1) && payment < frankfurtPrice) || (destination.equals(dest2) && payment < kolnPrice)) {
                System.out.println("You have to pay more...");
            } else if ((destination.equals(dest1) && payment >= frankfurtPrice) || (destination.equals(dest1) && payment >= kolnPrice)) {
                break;
            }
             */
            if (destination.equals(dest1) && payment < frankfurtPrice) {
                System.out.println("You have to pay more...");
            } else if (destination.equals(dest1) && payment >= frankfurtPrice) {
                break;
            } else if (destination.equals(dest2) && payment < kolnPrice) {
                System.out.println("You have to pay more...");
            } else if (destination.equals(dest2) && payment >= kolnPrice) {
                break;
            }
        }

        if (destination.equals(dest1)) {
            changeBack = payment - frankfurtPrice;
            System.out.println("Route = " + destination);
            System.out.println("Frankfurt is " + frankfurtPrice + " Euro");
            System.out.println("You have " + changeBack + " €");
        } else if (destination.equals(dest2)) {
            changeBack = payment - kolnPrice;
            System.out.println("Route = " + destination);
            System.out.println("Köln is " + kolnPrice + " Euro");
            System.out.println("You have " + changeBack + " €");
        }

        input.close();
    }
}

package d5codeExercise;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        //Soru-6: Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter x-axis value: ");
        int x = input.nextInt();
        System.out.println("Please enter y-axis value: ");
        int y = input.nextInt();

        if(x>0 && y>0){
            System.out.println("Your point is on the 1. Area.");
        } else if (x<0 && y> 0) {
            System.out.println("Your point is on the 2. Area.");
        } else if (x<0 && y<0) {
            System.out.println("Your point is on the 3. Area.");
        } else if (x>0 && y<0) {
            System.out.println("Your point i on the 4. Area.");
        }

        input.close();

    }
}

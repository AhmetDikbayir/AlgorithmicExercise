package d12;

import java.util.Scanner;

public class Rectangle implements Shape {

    Scanner input = new Scanner(System.in);
    double longSide = 5;
    double shortSide = 2;
    @Override
    public void getArea() {

        System.out.println("Please enter the rectangle long side:");
        longSide = input.nextDouble();
        System.out.println("Please enter the rectangle short side:");
        shortSide = input.nextDouble();
        System.out.println("Reactangle area is: " + (longSide*shortSide));
    }
}

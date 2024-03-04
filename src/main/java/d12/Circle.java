package d12;

import java.util.Scanner;

public class Circle implements Shape{

    Scanner input = new Scanner(System.in);

    double diameter = 4;
    final double pi = 3.14;

    @Override
    public void getArea() {
        System.out.println("Please enter the circle diameter: ");
        double diameter = input.nextDouble();

        System.out.println("The circle area is: " + (pi*diameter*diameter));
    }
}

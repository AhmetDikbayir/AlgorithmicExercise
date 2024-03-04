package d12;

import java.util.Scanner;

public class Triangle implements Shape{

    Scanner input = new Scanner(System.in);

    double height = 3;
    double side = 4;
    double area =0;

    @Override
    public void getArea() {
        System.out.println("Please enter the triangle height:");
        height = input.nextDouble();
        System.out.println("Please enter the triangle side:");
        side = input.nextDouble();
        System.out.println("Triangle area is: " + (height*side/2));
    }
}

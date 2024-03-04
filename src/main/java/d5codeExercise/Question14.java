package d5codeExercise;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        while(true){
            for(int i =0; i<3; i++){
                System.out.println("Please enter first side of the triangle:");
                a = input.nextInt();
                System.out.println("Please enter second side of the triangle:");
                b = input.nextInt();
                System.out.println("Please enter third side of the triangle:");
                c = input.nextInt();
                break;
            }
            if(a >0 && b >0 && c >0){
                break;
            }else{
                System.out.println("Please enter a valid data");
            }
        }

        boolean isTraingle = a<(b+c) && a> Math.abs(b-c) && b<a+c && b>Math.abs(a-c) && c<b+a && c>Math.abs(a-b);

        boolean isRightAngle = (a*a == b*b + c*c) || (b*b == a*a +c*c) || (c*c == a*a + b*b);

        if(isTraingle){
            if(isRightAngle) {
                System.out.println("Congrats you have Right Angle triangle!");
            }else {
                System.out.println("Congrats you have a triangle!");
            }
        }else{
            System.out.println("Oooh sorry for that but you don't have any triangle...");
        }
        input.close();
    }
}

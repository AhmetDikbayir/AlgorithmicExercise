package d5codeExercise;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //        Soru-2: Kullanicidan 3 tene pozitif  tam sayi alniz. Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        //        Eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
        //        INFO-->üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
        //        a+b>c>a-b
        //        a+c>b>a-c
        //        b+c>a>b-c
        //        a=b=c ise es kenar ucgen

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
        boolean isEquiEdge = a==b && b == c;
        boolean isTwinEdge = a==b || b==c || a==c;
        boolean isRightAngle = (a*a == b*b + c*c) || (b*b == a*a +c*c) || (c*c == a*a + b*b);
        if(isTraingle){
            if(isEquiEdge){
                System.out.println("Congrats you have equi-edge triangle!!");
            }else if(isTwinEdge){
                if(isRightAngle)
                System.out.println("Congrats you have Twin Edge and Right Angle triangle!");
                else{
                    System.out.println("Congrats you have Twin Edge triangle!");
                }
            }else{
                if(isRightAngle)
                    System.out.println("Congrats you have Right Angle triangle!");
                else {
                    System.out.println("Congrats you have a triangle!");
                }
            }
        }else{
            System.out.println("Oooh sorry for that but you don't have any triangle...");
        }

        input.close();

    }
}

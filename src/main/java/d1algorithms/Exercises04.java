package d1algorithms;

public class Exercises04 {
    public static void main(String[] args) {
        //Find all prime number between the 0 - 1000

        int dividerCounter = 0;
        /*
        for(int i = 1; i<1000; i++){
            for(int j = 1; j<=i; j++){
                if(i %j == 0)dividerCounter++;
            }
            //Find all divider
            //System.out.println(i + " has " + dividerCounter + " piece of divider.");

            //Find perfect square number
            //if(dividerCounter %2 !=0) System.out.println(i + " is rootSquare number.");
            dividerCounter = 0;
        }
         */

        for (int i = 3; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) dividerCounter++;
            }
            if(dividerCounter == 0) System.out.print(i + " - ");
            dividerCounter = 0;
        }
    }
}

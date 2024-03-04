package d1algorithms;

public class Exercises03 {
    public static void main(String[] args) {
        //Find all Fibonacci numbers between 0-1000
        int a = 0;
        int b = 1;
        int c = 0;
        do {
            c = a + b;
            if(c>1000) {break;}
            a = b;
            b = c;
            System.out.print(c + "-");
        } while (c < 1000);

    }
}

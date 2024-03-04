package willAsk;

public class IfElseStatementQuest {
//        Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
//
//
//                max1020(11, 19) → 19
//        max1020(19, 11) → 19
//        max1020(11, 9) → 11
        public int maximum1020(int a, int b) {
            if((a<21 && a>9) && (b<21 && b>9)){
                return Math.max(a,b);
            }else if((a<21 && a>9) && (b>20 || b<10)){
                return a;
            }else if((a>20 || a<10) && (b<21 && b>9)){
                return b;
            }else {
                return 0;
            }
        }
    //Solution:
    public int max1020(int a, int b) {
        // First make it so the bigger value is in a
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    //--------------------------------

//    Given three int values, a b c, return the largest.
//
//
//    intMax(1, 2, 3) → 3
//    intMax(1, 3, 2) → 3
//    intMax(3, 2, 1) → 3

    public int intMaximum(int a, int b, int c) {
        if(a>b && a>c){
            return a;
        }else if(b>c && b>a){
            return b;
        } else{
            return c;
        }
    }

    //Solution:
    public int intMax(int a, int b, int c) {
        int max;

        // First check between a and b
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        // Now check between max and c
        if (c > max) {
            max = c;
        }

        return max;

        // Could use the built in Math.max(x, y) function which selects the larger
        // of two values.
    }
}

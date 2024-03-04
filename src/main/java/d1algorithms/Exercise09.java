package d1algorithms;

public class Exercise09 {
    public static void main(String[] args) {
        //10x10 sayı matrisi oluşturun.
        int a = 0;
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(a * 10 + j + " ");
            }
            a++;
            System.out.println();
        }

        //Verilen bir sayıyı tersten ve alt alta yazan kodu yazınız
        //Örnek: 86523
        //3
        //32
        //325
        //3256
        //32568

        int num = 86523;
        int result;
        String sResult = "";
        for (; num > 0; num /= 10) {
            result = num % 10;
            sResult += String.valueOf(result);
            System.out.print(sResult);
            System.out.println();
        }

        //Aşağıdaki şekli oluşturan kodu yazınız:
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Aşağıdaki şekli oluşturan kodu yazınız:
        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *

        for(int i=1; i<=5; i++){
            for(int j=5; j>i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");

        //Aşağıdaki şekli oluşturan kodu yazınız:
        // * * * * *
        //   * * * *
        //     * * *
        //       * *
        //         *

        for(int i =0; i<5; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int k = 5; k>i; k--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        //Aşağıdaki şekli çizen kodu yazınız.
        //     *
        //    ***
        //   *****
        //  *******
        // *********

        for(int i=1; i<=5; i++)
        {
            for(int j=i; j<5; j++)
                System.out.print(" ");
            for(int k=1; k<i*2; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

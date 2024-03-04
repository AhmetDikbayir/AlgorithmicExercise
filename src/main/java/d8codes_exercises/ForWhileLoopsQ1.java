package d8codes_exercises;

public class ForWhileLoopsQ1 {
    public static void main(String[] args) {
        //Soru-01: Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir METHOD create ediniz.
        //            Ör: Input : 50
        //            Bolenler : 2,5,10,20,50
        //            Asal Bolenler: 2,5
        //            En buyuk asal carpan: 5
        int input = 50;
        int counter = 0;
        int maxPrimeDivider = 2;
        for (int i = 2; i <= 50; i++){
            if(50%i==0){
                for(int j = 3; j<i; j++){
                    if(i%j==0){
                        counter++;
                    }
                    if(counter == 0 && j>maxPrimeDivider){
                        maxPrimeDivider = j;
                    }
                    counter = 0;
                }
            }

        }
        System.out.println(maxPrimeDivider);
    }
}

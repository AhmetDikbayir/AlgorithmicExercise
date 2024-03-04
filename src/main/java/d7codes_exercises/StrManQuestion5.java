package d7codes_exercises;

public class StrManQuestion5 {
    public static void main(String[] args) {
        //Soru-5: String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        //            String  str1 = %13.99
        //            String str2 = %10.55
        //            ipucu: Double.parseDouble() methodunu kullanabilirsiniz.
        String  str1 = "%13.99";
        String str2= "%10.55";
        double nStr1 = Double.parseDouble(str1.substring(1));
        double nStr2 = Double.parseDouble(str2.substring(1));

        double sum = nStr1 + nStr2;
        System.out.println(sum);
    }
}

package d8codes_exercises;

public class StrManQ11 {
    public static void main(String[] args) {
        //Soru-11: Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
        //		    String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String name = pickName.substring(0,1) + " " + pickName.substring(11,12);
        System.out.println(name);
    }
}

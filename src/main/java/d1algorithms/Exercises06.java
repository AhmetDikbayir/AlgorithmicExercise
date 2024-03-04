package d1algorithms;

public class Exercises06 {
    public static void main(String[] args) {
        String str = "Ayhan Beyhan";
        str = str.replace("han", "ol");
        System.out.println(str);

        System.out.println("----------------------");
        String str2 = "Java ah java";
        System.out.println(str2.contains("x"));

        System.out.println("----------------------");

        String str3 = "şeyhan yavuz";
        System.out.println(str3.replace("ş", "Ş"));
        System.out.println("str3 new version: " + str3.replace('y', 'Y'));
        System.out.println(str3.endsWith("şeyhan yavuz"));  //true
        System.out.println(str3.endsWith(""));  //true

        String str4 = "Java Kolaydır";
        System.out.println(str4.endsWith("dır"));

        System.out.println("----------------------");

        String b = "Ali 12 ?_";

        System.out.println(b.replaceAll("\\S", "*"));

        System.out.println("-----------------------");

        String s1 = "ali";
        String s2 = "Ali aşağı";
        System.out.println(s1==s2);
        String s3 = s2.replaceAll("[^a]", "1");
        System.out.println(s3);

        System.out.println("----------------");
        String s4 = "sarıkanarya";
        String first = s4.substring(0,4).replace("s", "S");
        String last = s4.substring(4).replace("k", "K");
        String result = first + " " + last;
        System.out.println(result);
        System.out.println(s4.replace("sarı", "****"));

        System.out.println("---------------------------");

        String pwd = "1234 6789 Ali";
        System.out.println(pwd.replaceAll("[a-zA-Z_0-9]", "*"));

    }
}

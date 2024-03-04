package d3codingBat;

public class StringManipulations {

//    Given a string, return a new string where the first and last chars have been exchanged.
//
//
//    frontBack("code") → "eodc"
//    frontBack("a") → "a"
//    frontBack("ab") → "ba"
    public String frontBack(String str) {
        if(str.length() == 0 || str.length() == 1){
            return str;
        }else{
            String firstCh = str.substring(0,1);
            String lastCh = str.substring(str.length()-1);
            String others = str.substring(1,str.length()-1);
            str = lastCh + others + firstCh;
            return str;
        }
    }

//    Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
//
//
//    missingChar("kitten", 1) → "ktten"
//    missingChar("kitten", 0) → "itten"
//    missingChar("kitten", 4) → "kittn"

    public String missingChar(String str, int n) {
        String strFirst = str.substring(0,n);
        String strLast = str.substring(n+1);
        str = strFirst + strLast;
        return str;
    }

    public static void main(String[] args) {

        String str = "cat";
        char lastCh = str.charAt(str.length()-1);
        System.out.println(lastCh + str + lastCh);

    }
}

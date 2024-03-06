package d15MapExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class d15MapExercises {
    public static void main(String[] args) {

        //Find the sum of values which has greater length then 3

        HashMap<String, Integer> stdNames = new HashMap<>();

        stdNames.put("Ali", 18);
        stdNames.put("Can", 19);
        stdNames.put("Tom", 33);
        stdNames.put("Veli", 63);
        stdNames.put("Ahmet", 41);
        stdNames.put("Jerry", 14);

        System.out.println(stdNames);

        Set<Map.Entry<String, Integer>> myMapEntry = stdNames.entrySet();
        System.out.println(myMapEntry);

        int sum = 0;
        for (Map.Entry<String, Integer> w : myMapEntry){
            if(w.getKey().length()>3){
                sum += w.getValue();
            }
        }
        System.out.println(sum);
    }
}

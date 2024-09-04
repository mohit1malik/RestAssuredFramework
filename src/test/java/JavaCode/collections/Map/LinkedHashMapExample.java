package JavaCode.collections.Map;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String args[]){
        Map<Integer,String> lm = new LinkedHashMap<Integer, String>();

        lm.put(3,"addidas");
        lm.put(6,"Rebook");
        lm.put(1,"Bata");
        lm.put(9,"Reli");
        lm.put(5,"Crocs");

        System.out.println(lm);

        for(int m: lm.keySet()){
            String value = lm.get(m);
            System.out.println(m + " " + value);
        }

        System.out.println("Remove key 1");
        lm.remove(1);
        System.out.println(lm);


    }
}

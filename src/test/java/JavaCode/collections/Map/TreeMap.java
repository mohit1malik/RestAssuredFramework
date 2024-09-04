package JavaCode.collections.Map;
import java.util.*;
public class TreeMap {
    public static void main(String[] args) {
        Map<Integer,String> tm = new java.util.TreeMap<Integer,String>();
        tm.put(11,"Superman");
        tm.put(4,"batman");
        tm.put(8,"Heman");
        tm.put(10,"Antman");

        for(int m:tm.keySet()){
            String Value = tm.get(m);
            System.out.println(m+ " " + Value);
        }


        System.out.println("----------");

        for(Map.Entry m: tm.entrySet()){
            System.out.println(m.getKey() + " " +m.getValue());
        }
        System.out.println("----------");

        tm.remove(8);
        System.out.println(tm);
    }
}

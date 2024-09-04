package JavaCode.collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSortingExample {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("Mahtma","Gandhi");
        map.put("Narender","Modi");
        map.put("Amit","Shah");
        map.put("Virender","Sehwag");


        forMethod(map);
        System.out.println("-------------");
        TreeMap<String,String> tm = new TreeMap<String,String>(map);
        forMethod(tm);


        System.out.println("Sort by value");
        String value = map.get("Amit");
        System.out.println(value);
        System.out.println(map.containsKey("Amit"));

    }

    public static void forMethod(Map<String,String> map){
        System.out.println("For method-----------");
        for(String name: map.keySet()) {
            String value = map.get(name);
            System.out.println(name + " " + value);
        }
    }
}

package JavaCode.collections.HashMap;

import java.util.*;

public class HashMapAddandRemoveElements {
    public static void main(String[] args) {
        System.out.println("First hash map m");

        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(44,"adding");
        map.put(16,"substraction");
        map.put(19,"multiply");
        map.put(15,"division");


        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+ " " +m.getValue());
        }

        System.out.println("Second hash map m1");
        Map<Integer,String> m =new HashMap<Integer,String>();
        m.put(101,"yahoo");
        m.put(104,"Google");
        m.put(110,"Apple");

        for(Map.Entry m1: m.entrySet()){
            System.out.println(m1.getKey()+ " " +m1.getValue());
        }

        System.out.println("after adding hash map m & m1");

        m.putAll(map);
        for(Map.Entry m2: m.entrySet()){
            System.out.println(m2.getKey()+ " " +m2.getValue());
        }


        m.remove(104);
        System.out.println("after removing hash key 104 - "+m);
        m.remove(15,"division");
        System.out.println("after removing hash key 15, division - "+m);

        System.out.println("Checking is the map empty - "+ m.isEmpty());

        System.out.println("-------");

        m.putIfAbsent(111,"Microsoft");
        System.out.println("put if absent- "+m);

        System.out.println("Size of Map m is- " +m.size());

        map.replaceAll((k,v)-> "mohit");
        System.out.println("repace all map value - "+map);
        System.out.println("m map value "+m);
    }
}

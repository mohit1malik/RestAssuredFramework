package JavaCode;

import java.util.Map;

public class LinkedHashMap<I extends Number, S> {
    public static void main(String args[]) {
        Map<Integer,String> map= (Map<Integer, String>) new LinkedHashMap<Integer,String>();
        map.put(101,"Amit");
        map.put(102,"Vijay");
        map.put(103,"Rahul");
        System.out.println("Before invoking remove() method: "+map);
        map.remove(102);
        System.out.println("After invoking remove() method: "+map);
    }
}

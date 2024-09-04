package JavaCode.collections.Map;
import java.util.*;

public class HashMapNewIeratorStyle {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(3,"Auto");
        map.put(8,"its");
        map.put(3,"mation");
        map.put(6,"");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+ " " +m.getValue());
            System.out.println("");
        }


        System.out.println("------------");

        Iterator <Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            int key = it.next();
            System.out.println(key+ " "+ map.get(key));
        }

    }

}

package JavaCode.collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapExample1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("Mahtma","Gandhi");
        map.put("Narender","Modi");
        map.put("Amit","Shah");
        map.put("Virender","Sehwag");


        forMethod(map);
        System.out.println("-------------");
        whileMethod(map);

    }

    public static void forMethod(Map<String,String> map){
        System.out.println("For method-----------");
        for(String name: map.keySet()) {
            String value = map.get(name);
            System.out.println(name + " " + value);
        }
    }

    public static void whileMethod(Map<String, String> map){
        System.out.println("While method-----------");
        Iterator itr = map.keySet().iterator();
        while(itr.hasNext()){
            String name = (String) itr.next();
            String value = map.get(name);
            System.out.println(name + " " + value);
        }
    }
}

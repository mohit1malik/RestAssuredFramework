package JavaCode.collections.Map;

import java.util.*;
public class HashMapOldStyle {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(4,"it");
        map.put(7,"");
        map.put(2,3);
        map.put(9,"");
        map.put(5,"Automation"  );

        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

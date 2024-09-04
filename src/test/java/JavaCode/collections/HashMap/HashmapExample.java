package JavaCode.collections.HashMap;

import javax.xml.transform.Source;
import java.util.*;

public class HashmapExample {
    public static void main(String[] args) {
        Book b1 = new Book(101,"OldMonkWhoSoldHisFerrai","Robin", "bpb",4);
        Book b2 = new Book(102,"Brilliant Minds","Mohit", "yaatra",4);
        Book b3 = new Book(103,"Clocks","Malik", "TRP",100);

        Map<Integer, Book> map = new HashMap<Integer, Book>();
        map.put(1,b1);
        map.put(12,b2);
        map.put(3,b3);

        System.out.println(map);
        for(Map.Entry<Integer, Book> m:map.entrySet()){
            int key = m.getKey();
            Book v = m.getValue();

            System.out.println(key + " details :- " + v.id+ " " +v.bookName+ " " +v.authorName+ " " +v.bookPublisher+ " " +v.quantity);


        }
    }


}

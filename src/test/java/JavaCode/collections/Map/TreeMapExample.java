package JavaCode.collections.Map;

import groovyjarjarantlr4.runtime.tree.Tree;

import java.util.*;
import java.util.TreeMap;

public class TreeMapExample {
    public static <TeeMap> void main(String[] args) {
        Book b1 = new Book(121,"OldMonkWhoSoldHisFerrai","Robin", "bpb",4);
        Book b2 = new Book(119,"Brilliant Minds","Mohit", "yaatra",4);
        Book b3 = new Book(10,"Clocks","Malik", "TRP",100);

        Map<Integer,Book> map = new TreeMap<>();

        map.put(15,b2);
        map.put(11,b1);
        map.put(17,b3);

        ForMehtod(map);

    }

    public static void ForMehtod(Map<Integer,Book> m){
        for(Map.Entry entry: m.entrySet()){
            int key = (int) entry.getKey();
            Book b = (Book) entry.getValue();
            System.out.println(key +"- ");
            System.out.println(b.id + " "+ b.bookName+ " "+ b.authorName+ " "+ b.bookPublisher+ " "+ b.quantity);

        }
    }

}

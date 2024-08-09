package JavaCode;

import java.util.*;

public class ArrayList {
    public static void main(String [] args)
    {
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("Is linkedList Empty: "+ll.isEmpty());

        ll.add("Vijay");
        ll.add("Ajay");
        ll.add("Z");
        ll.add("z");
        ll.add("F");
        ll.add("a");
        ll.add(0,"mohit");
        Iterator itr = ll.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("After Insertion");
        System.out.println("Is ArrayList Empty: "+ll.isEmpty());

        ll.remove(2);
        System.out.println("After deletion");
        Iterator itr2 = ll.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("Is ArrayList Empty: "+ll.isEmpty());

        System.out.println("when used sort method");

        Collections.sort(ll);

        for(int i=0; i<ll.size(); i++){
            System.out.println(ll.get(i));
        }
    }
}

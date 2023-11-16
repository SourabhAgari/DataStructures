package StriversDSA.datastructures;

import java.util.HashSet;
import java.util.Iterator;

// underlying ds is hashtable
// backed up by map
// introduced in version 1.2 jdk
public class hashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add("deepak");
        hs.add(100.55);
        hs.add("xyz");
        hs.add(true);

        // we can add the duplicate elements but hashset will not show that..
        hs.add("deepak");

        System.out.println(hs);


        // iteration
        Iterator itr = hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}

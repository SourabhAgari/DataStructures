package StriversDSA.datastructures;


import java.util.TreeSet;

// inherits navigable set class which in turn implements sorted set and set interface.
// underlying datastructures is balanced tree.
// properties :
// not an index based datastructures
// does not follow insertion order
// follows the sorting order
// stores only homogeneous elements(mainly used for comparison)
// not synchronised
// cannot add null values.

public class treeSet {
    public static void main(String[] args) {
        TreeSet treeset = new TreeSet();
        treeset.add(10);
        treeset.add(20);
        treeset.add(30);
        treeset.add(40);
        System.out.println(treeset);
    }
}

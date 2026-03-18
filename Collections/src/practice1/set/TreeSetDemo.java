package practice1.set;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1,5,10,23,1,5,10,10,20,30,40,10,1));

        System.out.println("TreeSet : "+treeSet);

        System.out.println(treeSet.headSet(23));
        System.out.println(treeSet.tailSet(23));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.higher(10));
        System.out.println(treeSet.lower(10));
        System.out.println(treeSet.ceiling(10));
        System.out.println(treeSet.floor(10));

        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());

        System.out.println("TreeSet : "+treeSet);

    }
}

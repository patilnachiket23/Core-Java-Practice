package practice1.set;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetWithParents {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(10,20,30,50,1,5,23,1,10,23));
        System.out.println(sortedSet);
        System.out.println("First Element : "+sortedSet.first());
        System.out.println("Last Element : "+sortedSet.last());

        //headSet
        System.out.println("All elements before 30 : "+sortedSet.headSet(30));
        //tailSet
        System.out.println("All elements after 30 including 30 : "+sortedSet.tailSet(30));

        System.out.println();
        System.out.println("----------------NavigableSet----------------");

        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(1);
        navigableSet.add(5);
        navigableSet.add(510);
        navigableSet.add(10);
        navigableSet.add(23);
        navigableSet.add(1);
        System.out.println("NavigableSet : "+navigableSet);

        System.out.println("Less than 20 : "+navigableSet.lower(20));
        System.out.println("Higher than 20 : "+navigableSet.higher(20));
        System.out.println("Celling than 20 : "+navigableSet.ceiling(20));
        System.out.println("Floor than 20 : "+navigableSet.floor(20));

        System.out.println();
        System.out.println("----------------Polling----------------");
        System.out.println("NavigableSet : "+navigableSet);

        System.out.println("Polling first element : "+navigableSet.pollFirst());
        System.out.println("Polling Last element : "+navigableSet.pollLast());

        System.out.println("NavigableSet : "+navigableSet);



    }
}

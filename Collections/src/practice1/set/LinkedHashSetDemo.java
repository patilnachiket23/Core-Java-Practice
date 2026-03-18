package practice1.set;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(10,20,40,30,70,10,20));
        System.out.println(linkedHashSet);
    }

}

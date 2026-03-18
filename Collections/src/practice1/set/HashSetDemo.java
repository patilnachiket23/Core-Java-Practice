package practice1.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>(Arrays.asList(10,20,30,40,10,20,50));
        System.out.println(num);


    }
}

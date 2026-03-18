package practice1.cursors;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(Arrays.asList(10,20,30,40));
        System.out.println(vector);

        System.out.println("----------Enumeration-----------");
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            Integer i = enumeration.nextElement();
            System.out.print(i+" ");
        }
    }
}

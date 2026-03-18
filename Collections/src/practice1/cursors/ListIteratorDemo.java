package practice1.cursors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10,20,30,40,60,70,100,90));
        System.out.println(arrayList);

        final ListIterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            final Integer data = listIterator.next();
            if(data==70){
                listIterator.add(80);
            }
            if(data==100){
                listIterator.remove();
            }
            if(data==90){
                System.out.println(listIterator.previousIndex());
            }
        }
        System.out.println(arrayList);
    }
}

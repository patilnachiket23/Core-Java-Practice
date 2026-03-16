package practice1.ArrayList;

import java.util.*;


public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list);
        list.add(1,2);  // O(n)
        System.out.println(list);
        System.out.println(list.get(1));  //O(1)

        ArrayList<Integer> arrayList = new ArrayList<>(list);
        System.out.println(arrayList);

        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,10,23));
        System.out.println(arrayList1);

//        Object[] arr = {1,"nachiket",23};
//        for(Object i: arr){
//            System.out.print(i+" ");
//        }


        Object clone = arrayList.clone();
        System.out.println(clone);

        /*
        int[] arr = {1,2,3,4};
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList2);

        Arrays.asList() works only with object arrays, not primitive arrays.
        If you pass a primitive array, it treats it as a single element.

         */

        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(1,3,5,2,23,10,5,4));

        Collections.sort(arrayList3);
        System.out.println(arrayList3);

    }
}

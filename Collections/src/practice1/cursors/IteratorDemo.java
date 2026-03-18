package practice1.cursors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Nachiket","Aayasnh","Krishna","Samira","Kashmira"));
        System.out.println(arrayList);

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String data = iterator.next();
            if(data.equals("Nachiket")){
                iterator.remove();
            }
            else {
                System.out.println(data);
            }
        }

        System.out.println(arrayList);

    }
}

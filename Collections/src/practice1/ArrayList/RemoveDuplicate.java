package practice1.ArrayList;


import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer>  arrayList = new ArrayList<>(Arrays.asList(23,5,2,14,5,2,1,1,54,4,23));
        System.out.println("OG : "+ arrayList);

        AbstractList<Integer> unique = new ArrayList<>();
        for(Integer data : arrayList){
            if(!unique.contains(data)){
                unique.add(data);
            }
        }

        System.out.println("Removed Duplicate of OG : "+unique);
    }
}

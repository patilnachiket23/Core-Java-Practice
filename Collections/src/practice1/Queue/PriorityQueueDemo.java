package practice1.Queue;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(400);
        pq.add(5);
        pq.add(23);
        pq.add(100);
        System.out.println(pq);

        // smaller ----> highest
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.add(10);
        pq1.add(400);
        pq1.add(5);
        pq1.add(23);
        pq1.add(100);

        System.out.println(pq1);

        // highest ----> smaller
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());



    }
}

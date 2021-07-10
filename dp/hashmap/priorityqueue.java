package dp.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args) {
        int arr[]={2,10,5,7,17,18,6,4};
        int k=3;
        int l=arr.length;
        PriorityQueue<Integer>pq =new PriorityQueue<>();
        for(int val:arr){
            pq.add(val);
        }
        int cntr=0;
        for(int val:arr){
            if(cntr>=l-k)
            System.out.println(pq.peek());
            cntr++;
            pq.remove();
        }
    }
}

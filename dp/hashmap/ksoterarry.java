package dp.hashmap;

import java.util.PriorityQueue;

public class ksoterarry {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,6,7,5,8,9};
        int k=2;
        int j=-k-1;
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
      for(int i=0;i<arr.length;i++,j++){
          if(i>k){
              arr[j]=pq.remove();
              pq.add(arr[i]);
              
               
           
           
      }
      else pq.add(arr[i]);
    }
    
    while(pq.size()>0){
        arr[j]=pq.remove();
        j++;
    }
    for(int i:arr){
        System.out.println(i);
    }
}
}

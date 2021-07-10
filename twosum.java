import java.util.Arrays;
import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
         int target=10;

// HASHMAP

         //         HashMap<Integer,Integer> hm=new HashMap<>();
//         for(int i=0;i<arr.length;i++)
//          hm.put(arr[i],1);  
   
//        System.out.println(hm);
//        for(int i=0;i<arr.length;i++)
//        {
//            int sum=arr[i];
//            int left=target-arr[i];
//            if(sum!=left && hm.containsKey(left)){
//            System.out.println(sum+"  "+left);
//            hm.remove(arr[i]);

               
           
//        }
      
    
//     }

// HASHING

// int hash[]=new int[50] ;
// for(int i=0;i<arr.length;i++){
//  hash[arr[i]]=1;
// }
// for(int i=0;i<arr.length;i++){
//     int sum=arr[i];
//     int left=target-arr[i];
//     if( sum!= left&&hash[left]==1){
//         hash[left]=0;
//         hash[arr[i]]=0;
//         System.out.println(sum+"  "+left);
//     }
// }

// SORTING
// Arrays.sort(arr);
// int i=0;
// int j=arr.length-1;
// while(i<j){
// while(i<j){
//     int sum=arr[i]+arr[j];
//     if(sum==target){
//     System.out.println(arr[i]+" "+arr[j]);
//     break;}
    
//     else if(sum>target){
//         j--;
//     }
//     else if (sum<target){
//         i++;
//     }
// }
// i++;
// }




}
    }
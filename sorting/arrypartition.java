package sorting;

public class arrypartition {
 public static void main(String[] args) {
     int arr[]={7,9,4,8,3,6,2,1};
     int pivot=5;
     int i=0,j=0;
     while(i<arr.length){
         if(arr[i]>pivot){
             i++;
         }
         else {
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j++;
         }
     }
     for(int r:arr){
         System.out.println(r);
     }
 }   
}

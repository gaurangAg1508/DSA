package sorting;

public class quickselect {
    public static void main(String[] args) {
        int arr[]={5,5,2,4,1,3};
        int k=2;
        quickselectt(arr, 0, arr.length-1, k-1);
    }
    public static void quickselectt(int arr[],int low,int high,int k) {
     int pivot=arr[high];
     int pi=partition(arr, low, high, pivot);
     if(pi>k){
         quickselectt(arr, low, pi-1, k);

     }   else if(pi<k){
        quickselectt(arr, pi+1, high, k);
     }else {
         System.out.println(arr[pi]);
     }
    }
    public static int partition(int arr[],int low,int high,int pivot){
     int i=low;
     int j=low;
     while(i<=high){
         if(arr[i]<pivot){
             int temp=arr[i];
             arr[j]=arr[i];
             arr[i]=temp;
             i++;
             j++;

         }
         else i++;
     }
     return j-1;

    }
    
}

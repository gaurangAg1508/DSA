package sorting;



// public class countsort {
//     public static void countsortt(int arr[],int low ,int high) {
//         int range=high-low+1;
//         int narr[]=new int[range];
//         for(int i=0;i<arr.length;i++){
//             int idx=arr[i]-low;
//             narr[idx]++;
//         }
        
//         for(int j=1;j<narr.length;j++){
//             narr[j]+=narr[j-1];
//         }
//         int ans[]=new int[arr.length];
//         for(int i=arr.length-1;i>=0;i--){
//             int val=arr[i];
//             int pos=narr[val-low];
//             int indx=pos-1;
//             ans[indx]=val;
//             narr[val-low]--;

//         }
//         for(int i:ans)
//         System.out.print(i+" ");
//     }
//     public static void main(String[] args) {
//         int arr[]={9,6,3,5,2,3,4,3,9,6,4,6,5,8,9,9};
//         countsortt(arr, 2,9);
//     }
// }
public class countsort{
    public static void countsortt(int arr[],int min,int max) {
     int range=max-min+1;
     int farr[]=new int[range];
     for(int i=0;i<arr.length;i++){
         int val=arr[i];
         int indx=val-min;
         farr[indx]++;
     }
     for(int i=1;i<farr.length;i++){
       farr[i]+=farr[i-1];
     }
     int ans[]=new int[arr.length];
     for(int i=arr.length-1;i>=0;i--){
       int val=arr[i];
       int pos=farr[val-min];
       int indx=pos-1;
       ans[indx]=val;
       farr[val-min]--;

     }
     for(int i:ans){
         System.out.print(i+" ");
     }
        
    }
    public static void main(String[] args) {
        
        int arr[]={9,6,3,5,2,3,4,3,9,6,4,6,5,8,9,9,1};
         countsortt(arr, 1,9);
    }
}























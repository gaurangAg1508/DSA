package sorting;

public class redixsort {
    
    public static void redixsortt(int arr[]) {
        int x=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>x)
            x=i;
        }
        int exp=1;
        while(exp<=x){
            countsortt(arr,exp);
            exp=exp*10;
        }

    }
    public static void countsortt(int arr[],int exp) {
        
        int farr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            int val=arr[i]/exp%10;
            int indx=val;
            farr[indx]++;
        }
        for(int i=1;i<farr.length;i++){
          farr[i]+=farr[i-1];
        }
        int ans[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
          int val=arr[i]/exp%10;
          int pos=farr[val];
          int indx=pos-1;
          ans[indx]=val;
          farr[val/exp%10]--;
   
        }
        for(int i:ans){
            System.out.print(i+" ");
        }}
        public static void main(String[] args) {
        
            int arr[]={5,12,234,987,9999,2,34,10000};
             redixsortt(arr);
        }
}

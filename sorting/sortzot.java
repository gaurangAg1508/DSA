package sorting;

public class sortzot {
    public static void main(String[] args) {
        int arr[]={0,0,2,2,1,1,0,1,0,1,0,0,1,1,};
        sort(arr);
    }
    public static void sort(int arr[]) {
        int i=0;
        int j=0;
        int k=arr.length-1;
       while(i<=k){
           if(arr[i]==0){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j++;
           }
            else if(arr[i]==2){
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
            
            k--;
           }
           else{
               i++;
           }
        }
        for(int y:arr){
            System.out.print(y+" ");

        }
        
    }
}

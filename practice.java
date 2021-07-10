import  java.util.ArrayList;

public class practice {
    public static int  kadanesdouble(int arr[]) {
       int arr2[]=new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];

        }
        for(int i=0;i<arr.length;i++){
            arr2[arr.length+i]=arr[i];

        }
        return kadanes(arr2);
    }
    

public static long Solution(int arr[],int sum,int k){
     if(k==1){
        return kadanes(arr);
     }
     if(sum<0){
      return kadanesdouble(arr);
     }
     else{
        return kadanesdouble(arr)+(k-2)*sum;
     }
     
    }
    public static int kadanes(int arr2[]) {
        
    
    int cursum=arr2[0];
    int oversum=arr2[0];

    for(int i=1;i<arr2.length;i++){
     if(cursum>0){
        cursum+=arr2[i];
    } else{
        cursum=arr2[i];
    }  
    if(cursum>oversum){
        oversum=cursum;
    } 
    }

return oversum;
}
public static void main(String[] args) {
    int arr[]={1,-2,1};
    int sum=0;
    int k=3;
   for(int i=0;i<arr.length;i++){
    sum+=arr[i];   
   }
  long oversum= Solution(arr,sum,k);
  System.out.println(oversum);
}}
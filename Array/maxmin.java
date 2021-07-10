package Array;

public class maxmin {
    public static void main(String[] args) {
        int []arr={2,99,100,7,8,3,6,22,34,900,1};
        int max=0;
        int min=0;
        int j;
        // if(arr.length==1){
        //     max=arr[0];
        //     min=arr[0];
        // }
        // if(arr[0]>arr[1]){
        //     max=arr[0];
        //     min=arr[1];
        // }
        // else {
        //     max=arr[1];
        //     min=arr[0];
        // }
        // for(int i=2;i<arr.length;i++){    //2*(n-2)+1
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        //     if(arr[i]<min){
        //        min=arr[i];
        //     }
        // }
        // System.out.println("MAX OF ARRAY== "+max);
        // System.out.println("MIN OF ARRAY=="+min);

       if(arr.length%2==0){
           if(arr[0]>arr[1]){        // 1+ 3*(n-2)/2
            max=arr[0];
            min=arr[1];
           }
           else{
            max=arr[1];
            min=arr[0];
           }
            j=2;
       } 
        else{
            max=arr[0];               //3*(n-1)/2
            min=arr[0];
             j=1;
       }
       while(j<arr.length-1){
        if(arr[j]>arr[j+1]){
           if(arr[j]>max){
               max=arr[j];
           }
           if(arr[j+1]<min){
           min=arr[j+1];
           }
        } 
        j=j+2;
       }
       System.out.println("MAX OF ARRAY== "+max);
       System.out.println("MIN OF ARRAY=="+min);
    }
}

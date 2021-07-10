public class rearrangeposneg {
    public static void main(String[] args) {
        int arr[]={-1,2,3,4,5,6,-7,8,9};
        int poscntr=0;
        int negcntr=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                poscntr++;
            }
            else negcntr++;
        }
        if(negcntr>poscntr){
        for(int j=0,k=arr.length-1;j<=k;j++,k--){
           
                if(arr[j]>0){
                    j++;
                }
                if(arr[k]<0){
                    k--;
                }
                if(arr[j]<0 &&arr[k]>0){
                    int temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                    j++;
                    k--;
                }
            
        }
    }
    else {
        for(int j=0,k=arr.length-1;j<=k;j++,k--){
           
            if(arr[j]<0){
                j++;
            }
            if(arr[k]>0){
                k--;
            }
            if(arr[j]>0 &&arr[k]<0){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                j++;
                k--;
            }
        
    }

    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}}

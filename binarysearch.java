public class binarysearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,55,70,80};
        int low=0;
        int high=arr.length-1;
        int find=55;
        boolean flag=false;
        while(low<=high){
            int med=(low+(high-low)/2);
            if(arr[med]==find){
                System.out.println(med);
                flag=true;
                break;
            }
            else if(find>arr[med]){
                low=med+1;
            }
            else if(find<arr[med]){
                high=med-1;
            }
        
        }
        if(flag==false){
            System.out.println("item not found");
        }
    }
}

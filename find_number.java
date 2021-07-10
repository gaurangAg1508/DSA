public class find_number {
    public static void main(String[] args) {
        int arr[]={10, 5, 15, 5, 15, 10, 1, 1};
int first=Integer.MIN_VALUE;
int sec=Integer.MIN_VALUE;
int third=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>first){
               third=sec;
               sec=first;
               first=arr[i];
           }
           else if(arr[i]>sec && arr[i]<first){
            third=sec;
            sec=arr[i];

           }
           else if(arr[i]>third && arr[i]<first&& arr[i]<sec){
            
            third=arr[i];

           }
       }
       System.out.println("FIRST  "+first);
       System.out.println("SECOUND  "+sec);
       System.out.println("THIRD  "+third);
    }
}

package sorting;

public class majorityele {

    public static void main(String[] args) {
        int arr[]={1,2,2,3,1,2,4,5,2,2,1};
        
        int count=1;
        int majele=arr[0];
        for(int i=1;i<arr.length;i++ ){
            if(arr[i]==majele){
                count++;
            }else {
                count--;
                if(count==0){
                    majele=arr[i];
                    count=1;
                }
            }
                
            }
            count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==majele){
                    count++;
                }
            }
            if(count>arr.length/2){
                System.out.println(majele);
            }
            else System.out.println("none ");
        }
    }


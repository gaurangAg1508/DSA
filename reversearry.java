
import java.util.*;
public class reversearry{


        //with repetative elements try hashing
            public static void main(String[] args) {
                //two elements can make up for this sum 
                int arr[]={2,4,7,12,17,5,8};
                for(int i=0,j=arr.length-1;i<=arr.length/2;i++,j--){
                    int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;

                }
                for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
              
            }

    }

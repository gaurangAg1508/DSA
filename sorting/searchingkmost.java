package sorting;

public class searchingkmost {
    public static void main(String[] args) {
        int start=0;
        int arr[]={70,60,70,80,90,100,120};
        int k=20;
        int val=100;
        while(start<arr.length){
            if(arr[start]==val){
                System.out.println(start);
            }
            int diff=Math.abs(arr[start]-val/k);
            diff=Math.max(1,diff);
            
            start=start+diff;
        }
    }
}

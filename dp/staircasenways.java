package dp;

import java.util.Scanner;

public class staircasenways {
    

public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scn.nextInt();
    }
    int cnt=casescnt(n,arr);
}

public static int casescnt(int n,int arr[]) {
    int dp[]=new int[n+1];
    dp[n]=1;
   for(int i=n;i>=0;i++){
       for(int j=1;j<arr[i] && i+j<n ;j++)
       {
           dp[i]+=dp[i+j];
       }
   } 
   return dp[0];
}
}
package dp;

import java.util.Scanner;

public class climbstairs {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int cp=countpaths(n);
        System.out.println(cp);
    }
    public static int  countpaths(int n) {
       int dp[]=new int[n+1];
       dp[0]=1;
       for(int i=1;i<n;i++){
           if(i==1){
               dp[i]=dp[i-1];
           }
           else dp[i]=dp[i-1]+dp[i-2];
       }
       return dp[n-1];
}}

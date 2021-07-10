class subsetsum{
    public boolean subset(int arr[],int x) {
        int row=arr.length;
        boolean dp[][]=new boolean[row+1][x+1];
        for(int i=0;i<row+1;i++){
            for(int j=0;j<x+1;j++){
                if(x==0&&j==0){
                    dp[i][j]=true;
                }
                else if(x==0){
                    dp[i][j]=false;

                }
                else if(j==0)
                {
                    dp[i][j]=true;
                }
                else{
                    if(dp[i-1][j]==true)
                    dp[i][j]=true;
                    else{
                        int var=arr[i-1];
                        if(j>=val)
                        if(dp[i-1][j-var]==true)
                        dp[i][j]==true;

                    
                    }
                }
            }
        }
        return dp[row+1][x+1];
        
    }
}
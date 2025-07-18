package DP.Fibonaci;

import java.util.Arrays;

//count ways to reach the n stir the persion can climb either 1 stair or 2 stair at at time ;
public class climbing_stare {
    public static int ways(int n,int dp[])
    {
        if(n==0)return 1; // if  1 when its one way to reach at base
        if(n<=0)return 0;
        if(dp[n]!= -1)return dp[n];
        dp[n]= ways(n-1,dp)+ways(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args) {

        int n=3;
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        int ans=ways(n,dp);

        System.out.println("ways to climbing stir :"+ans);


    }
}

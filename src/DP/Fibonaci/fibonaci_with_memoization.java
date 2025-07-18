package DP.Fibonaci;

import java.util.Arrays;

public class fibonaci_with_memoization {
    static  int fib(int n, int []dp)
    {
        if(n==0)return 0;
        if(n<=1 ) return 1;
        if(dp[n]!=-1)return dp[n];
        dp[n]= fib(n-1, dp)+fib(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n =5;
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        for(int i=0;i< n;i++)
        {
            System.out.println("fib"+fib(i, dp));;
        }

    }
}

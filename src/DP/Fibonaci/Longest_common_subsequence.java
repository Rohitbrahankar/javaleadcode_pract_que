package DP.Fibonaci;

import java.util.Arrays;

public class Longest_common_subsequence {
    static  int lcs(String s1 , String s2 , int n , int m,int dp[][])
    {
        if(n==0 || m==0)return 0;
        if(dp[n][m]!=-1)return dp[n][m];

        if(s1.charAt(n-1) == s2.charAt(m-1))
        {
           dp[n][m]= lcs(s1 , s2 , n-1 , m-1, dp)+1;
           return dp[n][m];
        }else{
//            int ans1 = lcs(s1,s2,n-1 , m,dp);
//            int ans2=lcs(s1 , s2 , n , m-1,dp);
//            return Math.max(ans1,ans2);
            int ans1 = lcs(s1, s2, n-1, m, dp);
            int ans2 = lcs(s1, s2, n, m-1, dp);
            dp[n][m] = Math.max(ans1, ans2);
            return dp[n][m];

        }
    }
    public static void main(String[] args) {
        String s1="abcde";
        String s2="ace";

        int n = s1.length();
        int m= s2.length();
        int dp[][]= new int[n+1][m+1];
        for(int [] col : dp)
        {
            Arrays.fill(col, -1);
        }
        System.out.println(lcs(s1 , s2, n , m , dp));

    }
}

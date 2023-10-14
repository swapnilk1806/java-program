package collage.DataStructure;

import java.util.Arrays;

public class CatalanNumberProblem {
    public static int CatalanRec(int n,int ans){
        if (n==0 || n== 1){
            return 1;
        }

        for (int i=0; i<n; i++){
            ans += CatalanRec(i,ans) * CatalanRec(n-1-i,ans);
        }
        return ans;
    }

    public static int CatalamMemo(int n,int [] dp){
        if (n==0 || n==1){
            return 1;
        }
        if (dp[n] != -1){
            return dp[n];
        }
        int ans =0;
        for (int i=0; i<n; i++){
            ans += CatalamMemo(i,dp) * CatalamMemo(n-i-1,dp);
        }
        return dp[n]= ans;
    }
    public static int CatalanTabulation(int n){
        int [] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i=2; i<=n; i++){
            for (int j=0; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
//        int n = 50;
//        System.out.println(CatalanRec(n,0));
//        int [] dp = new int[n+1];
//        Arrays.fill(dp,-1);
//        System.out.println(CatalamMemo(n,dp));
        System.out.println(CatalanTabulation(300));
    }
}

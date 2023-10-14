package collage.DataStructure;

public class Memo01Knapsack {
    public static int KnapsackP(int [] val ,int [] wt,int bagweight,int n,int [][] dp){
        if(n==0 || bagweight==0){
            return 0;
        }
        if(dp[n][bagweight] != -1){
            return dp[n][bagweight];
        }

        if(wt[n-1] <= bagweight){
            int ans = val[n-1]+ KnapsackP(val, wt, bagweight-wt[n-1], n, dp);
            int ans1 = KnapsackP(val, wt, bagweight-wt[n-1], n, dp);;
            dp[n][bagweight] = Math.max(ans,ans1);
            return dp[n][bagweight];
        }else{
            dp[n][bagweight] = KnapsackP(val, wt, bagweight, n-1, dp);
            return dp[n][bagweight];
        }
    }
    public static void main(String[] args) {

        int [] val = {15,14,14,45,30};
        int [] wt = {2,5,1,3,4};
        int bagweight =7 ;

        int [][] dp = new int[val.length+1][bagweight+1];

        for (int i=0; i< dp.length;  i++){
            for (int j=0; j< dp[0].length; j++){
                dp[i][j] = -1;
            }
        }


        System.out.println(KnapsackP(val,wt,bagweight,val.length,dp
        ));
    }
}

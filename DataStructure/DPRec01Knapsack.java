package collage.DataStructure;

public class DPRec01Knapsack {
    public static int Knapsack(int [] val,int bagweight,int [] wt,int n){
        if (n==0 || bagweight ==0) {
            return 0;
        }
            if(wt[n-1] <= bagweight){
                //inlude

                int ans = val[n-1] + Knapsack(val,bagweight-wt[n-1],wt,n-1);
                //exclude
                int ans2 = Knapsack(val,bagweight,wt,n-1);
                return Math.max(ans,ans2);
            }else{
                return Knapsack(val,bagweight,wt,n-1);
            }
    }
    public static void main(String[] args) {
        int [] val = {15,14,14,45,30};
        int [] wt = {2,5,1,3,4};
        int bagweight =7 ;

        System.out.println(Knapsack(val,bagweight,wt,val.length));
    }
}

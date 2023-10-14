
package collage.DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndainCoins {
    public static void FUN(Integer [] coins,int amount ){
        Arrays.sort(coins, Comparator.reverseOrder());
        for (int i=0; i<coins.length; i++){
            System.out.print(coins[i] + " ");
        }
        int countOfCoin =0;


        ArrayList<Integer> ll = new ArrayList<>();

        for (int i=0; i< coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoin++;
                    ll.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total conis used : "+countOfCoin);
        System.out.print("total Rs : ");
        for (int i=0; i<ll.size(); i++){
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Integer coins [] = {1,2,5,10,20,50,100,500,2000};


        FUN(coins,50000);
    }
}

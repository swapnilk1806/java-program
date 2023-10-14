
package collage.DataStructure;

import java.util.Arrays;
import java.util.Comparator;

public class GreedyFractionalKnapsack {
    public static void Fravtionl(int [] val,int[] weight,int W){
//        double [][] ratio = new double[val.length][];

//        for (int i=0; i<val.length; i++){
//            ratio[i][0] = i;
//            ratio[i][1] = val[i]/(double)weight[i];
//        }
//
//        Arrays.sort(ratio,Comparator.comparingDouble(l->l[1]));
//
//        int capacity = W;
//        int finalvalue = 0;
//
//        for (int i= ratio.length-1; i>=0; i--){
//            int idx = (int) ratio[i][0];
//
//            if (capacity >= weight[idx]){
//                finalvalue += val[idx];
//                capacity -= weight[idx];
//            }else{
//                finalvalue += (ratio[i][1] * capacity);
//                capacity =0;
//                break;
//            }
//        }
//        System.out.println("Final value : "+finalvalue);
    }
    public static void main(String[] args) {
        int [] A = {60,100,120};
        int [] B = {10,20,30};
        int W = 50;

        Fravtionl(A,B,W);

        System.out.println();
    }
}

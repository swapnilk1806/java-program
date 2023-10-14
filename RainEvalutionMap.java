package collage;

import java.util.Scanner;

public class RainEvalutionMap {
    public static void Map(int arr[]) {
        int lrarr[] = new int[arr.length];
        int rlarr[] = new int[arr.length];
        int val =0;
        int count = 0;
        int n = arr.length;

//        left to right
        for (int i=0; i<n; i++){
            if(i ==0){
                lrarr[0] = arr[0];
            }
            if(val < arr[i]){
                val = arr[i];
            }
            lrarr[i] = val;
        }
           val =0;
//        right to left
        for (int i = n-1; i>=0; i--){
            if(i == n-1){
                rlarr[n-1] = arr[n-1];
            }
            if (val < arr[i]){
                val = arr[i];
            }
            rlarr[i] = val;
        }

        for (int i=0; i<n; i++){
//            System.out.println(lrarr[i] + "  "+ rlarr[i]);
            val = Math.min(lrarr[i],rlarr[i]);
          count += val - arr[i];
        }
        System.out.println(count);
    }
    public static void main(String[] args) {

          int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};


        Map(arr);
    }
}

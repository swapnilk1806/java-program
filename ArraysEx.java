

package collage;

import java.util.Arrays;

public class ArraysEx {



    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        Arrays.sort(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
//        System.out.println(Arrays.equals(arr,1,1));


//        System.out.println(Arrays.binarySearch(arr,10000));
//        System.out.println(Arrays.hashCode(arr));


    }
}

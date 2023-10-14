
package collage.DataStructure;

import java.util.Arrays;

public class MinAbsoluteDifferencePairs {
    public static int Absolute(int []A,int[] B){
        Arrays.sort(A);
        Arrays.sort(B);
        int Diff = 0;
        for (int i=0; i<A.length; i++){
            Diff += Math.abs(A[i]-B[i]);
        }
        return Diff;
    }
    public static void main(String[] args) {
        int [] A= {2,4,6};
        int [] B = {3,5,7};

        System.out.println(Absolute(A,B));
    }
}

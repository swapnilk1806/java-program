package collage.DataStructure;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs {
    public static void main(String[] args) {
        int [][] pairs = {{5,24},{39,60},{5,20},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));

        int chainlen = 1;
        int chainEnd = pairs[0][1];

        for (int i=1; i<pairs.length; i++){
            if(pairs[i][0] >chainEnd){
                chainlen ++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Max lenght of chain "+chainlen);
    }
}

package collage.DataStructure;

import java.util.HashSet;

public class UnionIntersectionHash {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        int [] arr1 = {7,8,9};
        int [] arr2 = {5,2,3,1,4};

        /*
                Union
         */
        for (int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        for (int i=0; i<arr2.length; i++){
            hs.add(arr2[i]);
        }
        System.out.println("Union : "+hs);



        // Intersection

        hs.clear();

        for (int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        int count =0;
        for (int i=0; i<arr2.length; i++){
            if(hs.contains(arr2[i])){
                count++;
                hs.remove(arr2[i]);
            }
        }
        System.out.println(hs);
    }
}

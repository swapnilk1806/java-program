

package collage;

import java.util.ArrayList;
import java.util.Collections;

/**
 * copy right scrik
 */

public class LonelyNumberArrayList {
    public static ArrayList<Integer> FindLoney(ArrayList<Integer> l1) {
        Collections.sort(l1);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < l1.size()-1; i++) {
            if(l1.get(i-1)+1 < l1.get(i) &&  l1.get(i) +1 < l1.get(i+1)) {
                list.add(l1.get(i));
            }
        }

        if(l1.size() == 1){
            list.add(l1.get(0));
        }

       if(l1.size() > 1){
           if(l1.get(0) +1 < l1.get(1)){
               list.get(l1.get(0));
           }
           if(l1.get(l1.size() -2) +1 < l1.get(l1.size()-1)){
               list.add(l1.get(l1.size()-1));
           }
       }
       return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(10);
        l1.add(6);
        l1.add(5);
        l1.add(8);

        System.out.println(FindLoney(l1));
    }
}

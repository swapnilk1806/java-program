

package collage;

import java.util.ArrayList;

public class MonotonicArrayList {
    public static boolean Monotanic(ArrayList<Integer> l1){
        boolean inc = true;
        boolean dec = true;
        for (int i=0; i<l1.size()-1; i++){
            if(l1.get(i) > l1.get(i+1)){
                inc = false;
            }
            if(l1.get(i) < l1.get(i+1)){
                dec = false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(23);
        l1.add(56);
        l1.add(78);
        l1.add(90);

        if(Monotanic(l1)){
            System.out.println("Given array list Monotonic");
        }else{
            System.out.println("Given array list does not Monotonic");
        }

    }
}

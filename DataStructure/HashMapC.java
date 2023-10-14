package collage.DataStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapC {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Golya",66);
        hm.put("DI",56);
        hm.put("Ranu",78);
        hm.put("Tanu",56);

//        System.out.println(hm.isEmpty());
//        System.out.println(hm.size());
//        System.out.println(hm.get("Golya"));
//        System.out.println(hm.get(66));

//
//        System.out.println(hm.containsKey("Golya"));
//        System.out.println(hm.containsValue(66));


        for(Map.Entry<String,Integer> e1 :  hm.entrySet()){
            System.out.println(e1.getKey() + "   "+e1.getValue());

        }

        Set<Map.Entry<String,Integer>> entry = hm.entrySet();

        for (Map.Entry<String,Integer> entry1 : entry){
            System.out.println(entry1.getKey() + "   "+entry1.getValue());
        }
    }
}

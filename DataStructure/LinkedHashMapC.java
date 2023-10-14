package collage.DataStructure;

import java.util.LinkedHashMap;

public class LinkedHashMapC {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> lh = new LinkedHashMap<>();

        lh.put("Golu",66);
        lh.put("Tanu",90);
        lh.put("Ranu",56);
        lh.put("Didi",34);


        for(String key : lh.keySet()){
            System.out.println("Key : "+key );
        }
    }
}


package collage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEX {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(2);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(8);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}

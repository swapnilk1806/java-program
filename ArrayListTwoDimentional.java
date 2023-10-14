package collage;

import java.util.ArrayList;

public class ArrayListTwoDimentional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlsit = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(123);
        list1.add(567);
        list1.add(345);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(321);
        list2.add(528);
        list2.add(456);

        mainlsit.add(list1);
        mainlsit.add(list2);

        System.out.println(mainlsit);


        System.out.println("Array list print");
        System.out.println();


        for (int i=0; i<mainlsit.size(); i++){
            ArrayList<Integer> l1 = mainlsit.get(i);

            for (int j=0; j< list1.size(); j++){
                System.out.print(l1.get(i)+ " ");
            }
            System.out.println();
        }

    }
}

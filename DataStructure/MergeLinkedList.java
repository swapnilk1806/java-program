package collage.DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();;
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();
        LinkedList<Integer> l4 = new LinkedList<>();

        l1.add(78);
        l1.add(13);
        l1.add(34);
        l1.add(11);

        l2.add(48);
        l2.add(83);
        l2.add(04);
        l2.add(66);

        l3.add(34);
        l3.add(65);
        l3.add(96);
        l3.add(10);

        l4.add(1);
        l4.add(12);
        l4.add(94);
        l4.add(51);


        PriorityQueue<Integer> pp = new PriorityQueue<>();

        while (!l1.isEmpty()){
            pp.add(l1.remove());
        }

        while (!l2.isEmpty()){
            pp.add(l2.remove());
        }

        while (!l3.isEmpty()){
            pp.add(l3.remove());
        }

        while (!l4.isEmpty()){
            pp.add(l4.remove());
        }

        LinkedList<Integer> ll = new LinkedList<>();

        while (!pp.isEmpty()){
            ll.add(pp.remove());
        }

        for (int i=0; i<ll.size(); i++){
            System.out.print(ll.remove()+" ");
        }

//
//        List<LinkedList<Integer> ll = new LinkedList<>();

        
    }
}

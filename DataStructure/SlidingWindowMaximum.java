package collage.DataStructure;

import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    static class Pair implements Comparable<Pair>{
        int index;
        int num;

        public Pair(int val ,int i){
            this.index = i;
            this.num = val;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.num - this.num;
        }
    }
    public static void main(String[] args) {

        int [] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int [] res = new int[arr.length-k+1];


        PriorityQueue<Pair> p1 = new PriorityQueue<>();

        for (int i=0; i<k; i++){
            p1.add(new Pair(arr[i],i));
        }

        res[0] += p1.peek().num;

        for (int i=k; i<arr.length; i++){
            while (p1.size() >0 && p1.peek().index <= (i-k)){
                p1.remove();
            }
            p1.add(new Pair(arr[i],i));
            res[k - i +1] = p1.peek().num;

        }



//        for (int i=0; i<res.length;i++)
//        {
//            System.out.print(res[i] + "  ");
//        }
    }
}

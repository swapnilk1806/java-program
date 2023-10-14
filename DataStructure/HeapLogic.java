package collage.DataStructure;

import java.util.ArrayList;

public class HeapLogic {
    static class Heap{
        ArrayList<Integer> ll = new ArrayList<>();

        public void add(int data){
            ll.add(data);

            int x = ll.size()-1;
            int par = (x-1) / 2;

            while(ll.get(x) < ll.get(par)){

                int temp = ll.get(x);
                ll.set(x,ll.get(par));
                ll.set(par,temp);
            }
        }

        public int peek(){
            return ll.get(0);
        }

        private void heapify(int i){
            int left = 2 * i  +1;
            int right =  2 * i +2;
            int minix = i;

            if (left < ll.size() && ll.get(minix) > ll.get(left)) {
                minix = left;
            }

            if (right < ll.size() && ll.get(minix) > ll.get(right)){
                minix = right;
            }

            if(i == minix){
                int temp = ll.get(i);
                ll.set(i,ll.get(minix));
                ll.set(minix,temp);

                heapify(minix);
            }
        }
        public int romeve(){
            int data = ll.get(0);


            int temp = ll.get(0);
            ll.set(0,ll.size()-1);
            ll.set(ll.size()-1,temp);

            ll.remove(ll.size()-1);


            heapify(0);
            return data;

        }
    }
    public static void main(String[] args) {

    }
}

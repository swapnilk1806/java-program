package collage.DataStructure;

import java.util.LinkedList;

public class HashMapImplemention {
    static class HashMap<K,V>{
        public class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }

        private int size;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.size =0;
            this.buckets = new LinkedList[4];

            for (int i=0; i<4; i++){
                this.buckets[i] = new LinkedList();
            }
        }
    }
    public static void main(String[] args) {

    }
}

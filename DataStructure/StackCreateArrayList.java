

package collage.DataStructure;

import java.util.ArrayList;

public class StackCreateArrayList {
    static class Stack1{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int  pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
    }

    public static void main(String[] args) {
        Stack1 s = new Stack1();

        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

}
//static class Node{
//            int data;
//            Node next;
//            Node(int data){
//                this.data = data;
//                this.next = null;
//            }
//        }
//        static class Stack{
//          static Node head = null;
//          public static boolean isEmpty(){
//              return head == null;
//          }
//            public static void push(int data){
//                Node newnode = new Node(data);
//                if(isEmpty()){
//                    head = newnode;
//                    return;
//                }
//                newnode.next = head;
//                head = newnode;
//            }
//
//            public static int pop(){
//              if(isEmpty()){
//                  return -1;
//              }
//              int  top = list
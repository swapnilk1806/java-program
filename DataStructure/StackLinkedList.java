package collage.DataStructure;

public class StackLinkedList {
    static class Stack1 {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

    }
    static class Stack{
        static Stack1.Node head = null;

        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Stack1.Node newnode = new Stack1.Node(data);
            if(head == null){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public static int pop(){
            if(head == null){
                return -1;
            }
            if(head.next == null){
                int val = head.data;
                head = null;
                return val;
            }
            int val = head.data;
            head = head.next;
            return val;
        }
        public static int peek(){
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}

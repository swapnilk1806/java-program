
package collage.DataStructure;

public class ZigZagLinkedList {
    public static class Node {
        int data;
       Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    public void AddFrist(int data){
     Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void PrintData(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void PrintData(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void zigzag(){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node curr = mid.next;
        mid.next = null;
        //

        Node prev = null;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //

        Node left  = head;
        Node right = prev;
        Node nextL,nextR;
//        PrintData(head);
//        PrintData(prev);
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR =right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }
    public static void main(String[] args) {
        ZigZagLinkedList ll = new ZigZagLinkedList();

        ll.AddFrist(5);
        ll.AddFrist(4);
        ll.AddFrist(3);
        ll.AddFrist(2);
        ll.AddFrist(1);


        ll.PrintData();

        ll.zigzag();

        ll.PrintData();
    }
}

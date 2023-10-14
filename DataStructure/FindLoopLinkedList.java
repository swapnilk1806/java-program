
package collage.DataStructure;

public class FindLoopLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void AddFrist(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }
    public static Node head;
    public  void Print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static boolean IsCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        FindLoopLinkedList ll = new FindLoopLinkedList();

//        ll.AddFrist(14);
//        ll.AddFrist(13);
//        ll.AddFrist(12);
//        ll.AddFrist(11);
       Node head = new Node(10);
       head.next = new Node(12);
      head.next.next = new Node(13);
      head.next.next.next = new Node(14);

        System.out.println(IsCycle());

    }
}

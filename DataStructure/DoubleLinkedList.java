
package collage.DataStructure;

public class DoubleLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void AddFrist(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }
    public void AddLast(int data){
        Node newnode = new Node(data);

        if (head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void Print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print(" null");
        System.out.println();
    }

    public void RemoveFrisT(){
        if (head == null){
            System.out.println("Double linked list Empty");
            return;
        }

        if(head.next == null){
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void RemoveLast(){
        if (head == null){
            System.out.println("Double linked list Empty");
            return;
        }
        if (head.next == null){
          head = tail = null;
          return;
        }

        tail.prev.next = null;
    }
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();

        dll.AddFrist(12);
        dll.AddFrist(11);
        dll.AddFrist(10);
        dll.AddFrist(9);

        dll.Print();

//        dll.RemoveFrisT();
//        dll.RemoveFrisT();
//        dll.AddLast(13);

        dll.RemoveLast();
        System.out.println(tail.prev.next.data);

        dll.Print();
    }
}

package collage.DataStructure;

public class ReverseList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;
    public void AddFrist(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void PrintData(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void Reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        ReverseList ll = new ReverseList();
        ll.AddFrist(15);
        ll.AddFrist(14);
        ll.AddFrist(13);
        ll.AddFrist(12);
        ll.AddFrist(11);

        ll.PrintData();
        ll.Reverse();
        System.out.println();
        System.out.println("Revrse Linked List");

        ll.PrintData();

    }
}

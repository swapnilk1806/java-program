
package collage.DataStructure;

public class ListPalindrome {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
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
        head = newnode;
    }

    public void PrintData(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    public void Palindrome(){
        Node temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(size == 0){

        }
//        size = size/2;
//        int i =0;
//        temp = head;
//        while(i == size){
//
//        }
//        System.out.println(size);
    }
    public static void main(String[] args) {
        ListPalindrome ll = new ListPalindrome();
        ll.AddFrist(10);
        ll.AddFrist(9);
        ll.AddFrist(8);
        ll.AddFrist(7);
        ll.AddFrist(6);

        ll.PrintData();

        ll.Palindrome();
    }
}

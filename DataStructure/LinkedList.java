
package collage.DataStructure;

public class LinkedList {
    public static int size;
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;

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

    public void AddLast(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = tail = newnode;
            return;
        }

       tail.next = newnode;
        tail = newnode;
    }
    public void PrintData(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void AddMiddle(int index,int data){
        if(index ==0){
            AddFrist(data);
            return;
        }

        Node newnode = new Node(data);
        Node temp = head;
        int i  =  0;

        while (i < index-1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int Search(int key){
        Node temp = head;
        int i =0;
        while(temp != null){
            if(key == temp.data){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.AddFrist(12);
        ll.AddFrist(11 );
        ll.AddLast(14);
        ll.AddLast(15);
        ll.AddMiddle(2,13);
        ll.AddMiddle(0,10);
        ll.PrintData();

        System.out.println(size);
        System.out.println(ll.Search(12));
    }
}

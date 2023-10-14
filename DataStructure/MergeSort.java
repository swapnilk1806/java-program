
package collage.DataStructure;

public class MergeSort {
      public static class Node{
          int data;
          Node next;

          public Node(int data){
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

    private Node merge(Node head1,Node head2){
          Node mergedLL = new Node(-1);
          Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);

        Node righthead = mid.next;
        mid.next = null;

        Node newleft = mergeSort(head);
        Node newright = mergeSort(righthead);

        return merge(newleft,newright);
    }

    public static void main(String[] args) {
        MergeSort ll = new MergeSort();

        ll.AddFrist(12);
        ll.AddFrist(11 );
        ll.AddFrist(34);
        ll.AddFrist(45);
        ll.AddFrist(56);

        ll.PrintData();

        ll.head = ll.mergeSort(head);
        ll.PrintData();
    }
}

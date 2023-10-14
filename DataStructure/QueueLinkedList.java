
package collage.DataStructure;

public class QueueLinkedList {
    public static class Queue{
        int data;
        Queue next;

        public Queue(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Queue rear = null;
    public static Queue front  = null;

    public static void inQueue(int data){
        Queue newnode = new Queue(data);

        if(rear == null){
            rear = newnode;
            front = newnode;
            return;
        }
       newnode.next = rear;
        rear = newnode;
    }

    public static int deQueue(){
        if(rear == null){
            System.out.println("Queue is Empty");
            return Integer.MAX_VALUE;
        }

        if(rear.next == null){
            int val = rear.data;
            rear = null;
            front = null;
            return val;
        }
        int val = front.data;
        front = front.next;
        return val;
    }

    public static boolean isEmpty(){
        return rear == front;
    }
    public static void main(String[] args) {
      inQueue(12);
      inQueue(13);
      inQueue(14);
      inQueue(15);


//        System.out.println(deQueue());
//        System.out.println(deQueue());

        while(!isEmpty()){
            System.out.println(deQueue());
        }
    }
}

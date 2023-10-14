
package collage.DataStructure;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeLinkedlistUseStack {
    public static boolean palindrome(LinkedList<Integer> ll){
        Stack<Integer> s = new Stack();
        int i =0;
        while(i < ll.size()/2){
            s.push(ll.get(i));
            i++;
        }
        if(ll.size()%2 !=0){
            i++;
        }
        while(!s.isEmpty()){
            if(ll.get(i) != s.pop()){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void PrintLinkedList(LinkedList<Integer> ll){
    for (int i= 0; i<ll.size(); i++){
        System.out.println(ll.get(i));
    }
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

//        ll.add(12);
//        ll.add(13);
//        ll.add(14);
//        ll.add(16);
//        ll.add(14);
//        ll.add(13);
//        ll.add(12);
//        System.out.println("Linked linked list : "+ll);
//        System.out.println(palindrome(ll));

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);

        System.out.println(s.removeAll(Collections.emptyList()));



//        PrintLinkedList(ll);
    }
}

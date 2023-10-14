

package collage.DataStructure;

import java.util.Stack;
public class StackReverse {
    public static void Reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int val = s.pop();
        Reverse(s);
        s.push(val);
    }
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);

        while(!s.isEmpty()){
            System.out.println(s.pop() );
        }
    }
}

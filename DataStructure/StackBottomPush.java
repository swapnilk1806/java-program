package collage.DataStructure;

import java.util.Stack;

public class StackBottomPush {
    public static void PushBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int val = s.pop();
        PushBottom(s,data);
        s.push(val);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(11);


        PushBottom(s,100);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}

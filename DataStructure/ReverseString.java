package collage.DataStructure;

import java.util.Stack;

public class ReverseString {
    public static void Reverse(String str){
        Stack<Character> s = new Stack<>();

        int idx = 0;

        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        String str1 = new String();
        while(!s.isEmpty()){
            char curr = s.pop();
//            result.append(curr);
            str1 = str1 + curr;
        }

//        System.out.println(result);
        System.out.println(str1);
    }
    public static void main(String[] args) {
        Reverse("swapnil");
    }
}

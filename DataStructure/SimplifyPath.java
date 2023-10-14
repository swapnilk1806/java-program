
package collage.DataStructure;

import java.util.Locale;
import java.util.Stack;

public class SimplifyPath {
    public static String simplify(String A){
//        Stack<String> s = new Stack<>();
        String res= "";
//        res +="/";
//
//        int len_A = A.length();
//
//        for (int i=0; i<A.length(); i++){
//            String dir = "";
//
//            while(i < len_A && A.charAt(i) == '/'){
//                i++;
//            }
//
//            while(i < len_A && A.charAt(i) != '/'){
//                dir += A.charAt(i);
//                i++;
//            }
//            if (dir.equals("..") == true){
//                continue;
//            }
//            else if (dir.equals(".") != true){
//                s.push(dir);
//            }
//            else if(dir.length() != 0){
//                s.push(dir);
//            }
//        }
//        Stack<String> s1 = new Stack<>();
//        while (!s.isEmpty()){
//            s1.push(s.pop());
//        }
//
//        while (!s.isEmpty()){
//            if(s1.size() !=  1){
//                res += (s1.pop()+ "/");
//            }else{
//                res += s1.pop();
//            }
//        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(simplify("/a/.."));
        System.out.println(simplify("/swapnilkadam/"));
    }
}

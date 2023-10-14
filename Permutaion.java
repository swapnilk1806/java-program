

package collage;

public class Permutaion {
    static int count = 0;
    public static void permuation(String str,String ans){
        if(str.length() == 0){
            count++;
            System.out.println(ans);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            permuation(newstr,ans+curr);
        }
    }

    public static void main(String[] args) {
//    permuation("abc","");

        String str = "abc";
        permuation(str,"");
        System.out.println("Total permutation : "+count);
    }
}

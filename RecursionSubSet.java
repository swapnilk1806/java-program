

package collage;

public class RecursionSubSet {
    public static void SubSet(String str,String ans,int i){
        if(i == str.length()){
            if(ans.length() ==0){
                System.out.println("null");
            }else {
                System.out.println(ans);
            }
            return;
        }
        SubSet(str,ans+str.charAt(i),i+1);
        SubSet(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str ="abc";
        SubSet(str,"",0);
    }
}

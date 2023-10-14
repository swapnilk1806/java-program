
package collage;

public class CountSubString {
    public static void SubString(String str,int count,int i){
        if(count == str.length()){
            return ;
        }
        for (int j =count; j<str.length(); j++){
            System.out.print(str.charAt(j));
        }
        System.out.println();
       SubString(str.substring(i),count+1,i+1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        SubString(str,0,0);
    }
}

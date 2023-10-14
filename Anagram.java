package collage;


import java.util.Arrays;

public class Anagram {
    public static void FunAnagram(String  str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()  == str2.length()){
            char [] str3 = str1.toCharArray();
            char [] str4 = str2.toCharArray();

//            System.out.println(str3);
//            System.out.println(str4);

            Arrays.sort(str4);
            Arrays.sort(str3);

            boolean res = Arrays.equals(str3,str4);

            if(res){
                System.out.println("Given string Anagram");
            }else{
                System.out.println("Given string is not Anagram");
            }
        }
    }
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        FunAnagram(str1,str2);
    }
}

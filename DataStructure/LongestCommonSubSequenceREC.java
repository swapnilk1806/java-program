package collage.DataStructure;

import org.w3c.dom.ls.LSException;

public class LongestCommonSubSequenceREC {
    public static int LCS(String str1,String str2,int n,int m){
        if (n==0 || m==0){
            return 0;
        }
        if (str1.charAt(n-1) == str2.charAt(m-1)){
            return LCS(str1, str2, n-1, m-1)+1;
        }else{
            int ans1 = LCS(str1, str2, n-1, m);
            int ans2 = LCS(str1, str2, n, m-1);

            return Math.max(ans1,ans2);
        }

    }
    public static void main(String[] args) {
        String str2 = "abedge";
        String str1 = "abcdg";

        System.out.println(LCS(str1,str2,str1.length(),str2.length()));
    }
}

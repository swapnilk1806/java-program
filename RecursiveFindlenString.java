package collage;

public class RecursiveFindlenString {
    public static int len(String str) {
        int count =0;
        if(0 == str.length()){
            return 0;
        }
        return len(str.substring(1)) +1;
    }
    public static void main(String[] args) throws Exception{
        String name = "swapnil";

        System.out.println("Len of string : "+len(name));

    }
}

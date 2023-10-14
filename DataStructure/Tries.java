package collage.DataStructure;

public class Tries {
    static class Node{
        Node [] children = new Node[26];
        boolean eow = false;
        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void Insert(String word){
        Node curr = root;

        for (int level =0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key){

        Node curr = root;
        for (int level =0; level < key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
        }
        return curr.eow == true;
    }
    public static void main(String[] args) {
        String [] name = {"the","a","there","their","any","three"};

        for (int i=0; i<name.length; i++){
            Insert(name[i]);
        }

        String InputString = "swapnil kadam";
        int len =0;
        int vowel =0;
        int space =0;
      //  for (char ch : InputString.toCharArray()){
        char[] Str = InputString.toCharArray();
            len++;
           for (int i=0; ; i++){
               if(Str[i] == '\0'){
                   break;
               }
               char ch = Str[i];
            if(ch == ' '){
                space++;
            }
            if(ch == 'a' || ch == 'i' || ch== 'e' || ch == 'o' || ch == 'u'){
                vowel++;
            }
        }

        System.out.println("Len : "+len);
        System.out.println("Space : "+space);
        System.out.println("Vowel : "+vowel);
    }
}

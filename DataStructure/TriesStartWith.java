package collage.DataStructure;

public class TriesStartWith {
    static class Node{
        Node [] children = new Node[26];
        boolean end;

        public Node(){
            for (int i=0; i<26; i++){
                children[i] = new Node();
            }
        }
    }

     static Node root = new Node();


    public static void Insert(String word){
        Node curr = root;

        for (int i=0; i<word.length(); i++){
            int idx = word.charAt(i)- 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.end = true;
    }
    public static void main(String[] args) {

        String [] word= {"apple","app","an","mango","man","women"};
        String prefix = "app";
        String prefix2 = "moon";

      for (int i=0; i<word.length; i++){
          Insert(word[i]);
      }
        System.out.println(prefix);
        System.out.println(prefix2);
    }
}

package collage.DataStructure;
import java.util.ArrayList;


public class BstCreate {
    static class Node{
        int data;
        Node left ;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static Node Create(Node root,int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = Create(root.left,val);
        }else{
            root.right = Create(root.right,val);
        }
        return  root;
    }
    public static void InOrder(Node root){
        if(root != null){
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }
    }

    public static boolean Search(Node root, int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        if(root.data > data){
            return Search(root.left,data);
        }else {
            return Search(root.right, data);
        }
    }

    public static Node Delete(Node root,int data){
        if(root == null){
            return root;
        }
        if(root.data > data){
           root.left = Delete(root.left,data);
        } else if (root.data < data) {
            root.right = Delete(root.right,data);
        }else {
            if(root.right == null && root.left == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            Node IS = FindInorderSuccer(root.right);
            root.data = IS.data;
            root.right = Delete(root.right,IS.data);
        }
        return root;
    }
    public static Node FindInorderSuccer(Node root){

        while (root.right != null){
            root = root.right;
        }
        return root;
    }
    public static void printData(ArrayList<Integer> path){

        for (int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");

    }
    public static void LeafPathPrint(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        if(root.left == null && root.right== null){
            printData(path);
        }

        path.add(root.data);;
        LeafPathPrint(root.left,path);
        LeafPathPrint(root.right,path);
        path.remove(path.size()-1);
    }
    public static boolean isValid(Node root,Node min,Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        if(max != null && root.data >= max.data){
            return false;
        }
        return isValid(root.left,min,root) && isValid(root.right,root,max);
    }

    public static Node Mirror(Node root){
        if(root == null){
            return null;
        }

        Node left = Mirror(root.left);
        Node right = Mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
    public static void main(String[] args) {
        int [] arr = {6,5,2,8,4,12};
        Node root = null;

        ArrayList<Integer> path;
        for (int val : arr){
            root =  Create(root,val);
        };
        InOrder(root);
        System.out.println();










//        root = Mirror(root);
//
//        InOrder(root);
//
//        System.out.println(isValid(root,null,null));



//        System.out.println(Search(root,2));
//        LeafPathPrint(root,new ArrayList<>());
//        root = Delete(root,5);
//
//        System.out.println();
//        InOrder(root);
    }
}

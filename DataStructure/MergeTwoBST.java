package collage.DataStructure;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class MergeTwoBST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            Node left = null;
            Node right = null;
        }

    }
    public static void Inorder(Node root,ArrayList<Integer> ll){
        if(root == null){
            return;
        }
        Inorder(root.left,ll);
        ll.add(root.data);
        Inorder(root.right,ll);

    }
    public static Node Merge(Node root1,Node root2){
         ArrayList<Integer> l1 = new ArrayList<>();
         ArrayList<Integer> l2 = new ArrayList<>();

         Inorder(root1,l1);
         Inorder(root2,l2);

         int i  = 0;
         int j=0;

         ArrayList<Integer> finallist = new ArrayList<>();;


         while(i<(l1.size()) && j<(l2.size())){
             if(l1.get(i) < l2.get(j)){
                 finallist.add(l1.get(i));
                 i++;
             }else{
                 finallist.add(l2.get(j));
                 j++;
             }
         }

         while(i < l1.size()){
             finallist.add(l1.get(i));
             i++;
         }
         while (j< l2.size()){
             finallist.add(l2.get(j));
             j++;
         }

        return MergeBST(finallist,0,finallist.size()-1);

    }

    public static Node MergeBST(ArrayList<Integer> list,int st,int end){
        if (st > end) {
            return null;
        }
        int mid = (st + end)/2;
        Node root =  new Node(list.get(mid));
        root.left = MergeBST(list,st,mid-1);
        root.right = MergeBST(list,mid+1,end);

        return root;


    }
    public static void Inorder(Node root){
        if (root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + "  ");
        Inorder(root.right);
    }
    public static void main(String[] args) {


        Node root1 = null;

        /*
                    3
                  /   \
                 2     4
                /
               1
         */


        root1 = new Node(3);
        root1.left = new Node(2);
        root1.right = new Node(4);
        root1.left.left = new Node(1);


        Node root2;

         /*
                    5
                  /   \
                 2     8
         */


        root2 = new Node(5);
        root2.left = new Node(2);
        root2.right = new Node(8);


        Node root = Merge(root1,root2);


        System.out.println("Inorder data print");
        Inorder(root);
    }
}

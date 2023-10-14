package collage.DataStructure;

public class BinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BiTree{
        static int idx = -1;;
        public Node  bulidTree(int [] nodes){
             idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = bulidTree(nodes);
            newnode.right = bulidTree(nodes);

            return newnode;
        }

        public void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+ "   ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+"   ");
            inorder(root.right);
        }

        public void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + "  ");
        }
        public int hight(Node root){
            if(root == null){
                return 0;
            }
            int lh = hight(root.left);
            int hl = hight(root.right);

            return Math.max(lh,hl) + 1;
        }

        public int TotalNode(Node root){
            if (root == null){
                return 0;
            }
            int leftcount =  TotalNode(root.left);
            int rightcount = TotalNode(root.right);

            return leftcount + rightcount +1;
        }
    }
    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BiTree tree = new BiTree();;
        Node root = tree.bulidTree(nodes);

        System.out.println("\n Preorder data");
        tree.preorder(root);
        System.out.println();

        System.out.println("\n Inorder data");
        tree.inorder(root);
        System.out.println();

        System.out.println("\n Postorder data");
        tree.postorder(root);


        System.out.println("\n \nTotal Nodes : "+tree.TotalNode(root));
        System.out.println("Hight of Btree : "+tree.hight(root));
    }
}

public class Preorder { 
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    } 
    static class BinaryTree{ 
        static int idx=-1;
        public static Node preorder(int nodes[]){
            idx++; 
            if(nodes[idx]==-1){
                return null;
            } 
            Node newnode=new Node(nodes[idx]); 
            newnode.left=preorder(nodes);
            newnode.right=preorder(nodes);
            return newnode;
        } 
        public static void preorder1(Node root){ 
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder1(root.left);
            preorder1(root.right);
        } 
        public static void inorder(Node root){
            if(root==null){
                System.out.print("-1"+" ");
                return;
            } 
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);

        } 
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 
        BinaryTree tree=new BinaryTree();
        Node root=tree.preorder(nodes);
        System.out.println(root.data);
        // System.out.println(root.left.left.data);
        // System.out.println(root.right.left.data); 
        tree.preorder1(root); 
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        

    }
}

public class MirrorBST {
    static class node{
        int data;
        node left;
        node right;
        public node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    } 
    public static node Mirror(node root){
        if(root==null){
            return null;
        }
        node mirrorLeft=Mirror(root.left);
        node MirrorRight=Mirror(root.right);

        root.left=MirrorRight;
        root.right=mirrorLeft;
        return root;
    }
    public static void preorder(node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
       node root=new node(5);
       root.right=new node(6);
       root.right.right=new node(7);
       root.left=new node(3);
       root.left.left=new node(2);
       root.left.right=new node(4);
       preorder(root);
       root=Mirror(root);
       preorder(root);
    }
}

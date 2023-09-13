public class TransformToSumTree { 
    static class node{
        int data;
        node left;
        node right;
        public node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    } 
    public static int transform(node root){
        if(root==null){
            return 0;
        } 
        int leftchild=transform(root.left);
        int rightchild=transform(root.right); 
        int left=root.left==null?0:root.left.data;
        int right=root.right==null?0:root.right.data;
        int data=root.data;
        root.data=left+right+leftchild+rightchild;
        return data;
    } 
    public static void preorder(node root){
        if(root==null){
            return;
        } 
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        transform(root);
        preorder(root);
    }
}

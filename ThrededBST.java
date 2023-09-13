public class ThrededBST {
    static class node{
        int data;
        node right;
        node left;
        boolean rightThread;
        public node(int data){
         this.data=data;
         this.right=null;
         this.left=null;
        }
    }
    public static node leftroot(node root){
        if(root==null){
            return null;
        }
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void Threaded(node root){
        node curr=leftroot(root);
        while(curr!=null){
            System.out.println(curr.data);
            if(curr.rightThread){
                curr=curr.right;
            }else{
                curr=leftroot(curr.right);
            }
        }
    }
    public static node inorder(node root){
        if(root==null){
            return null;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);

        return root;
    }
    public static void main(String args[]){
      node root=new node(5);
      root.left=new node(3);
      root.left.left=new node(2);
      root.left.right=new node(4);
      root.right=new node(7);
      root.right.left=new node(6);
      root.right.right=new node(8);
      Threaded(root);
      inorder(root);

    }
}

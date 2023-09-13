//Assignment no 1
public class treeTraversal {
    static class node{
        int data;
        node right;
        node left;
        public node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static node preorder(node root){
        if(root==null){
            return null;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

        return root;
    }
    public static node Inorder(node root){
        if(root==null){
            return null;
        }

        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);

        return root;
    }
    public static node postorder(node root){
        if(root==null){
            return null;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

        return root;
    }
    public static void main(String args[]){
      node root=new node(5);
      root.left=new node(2);
      root.right=new node(3);
      root.left.left=new node(1);
      root.left.right=new node(6);
      root.right.left=new node(7);
      root.right.right=new node(9);
      System.out.println("The preorder sequence is :");
      preorder(root);
      System.out.println();
      System.out.println("The inorder sequence is :");
      Inorder(root);
      System.out.println();
      System.out.println("The postorder sequence is :");
      postorder(root);

      
    }
}

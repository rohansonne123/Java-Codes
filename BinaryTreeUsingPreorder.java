public class BinaryTreeUsingPreorder { 
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }  
    static class BinaryTree{ 
        static int idx=-1;
    public static Node Preorder(int nodes[]){ 
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
       Node newnode=new Node(nodes[idx]); 
       newnode.left=Preorder(nodes);
       newnode.right=Preorder(nodes);
       return newnode;
    }
  }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 
        BinaryTree tree=new BinaryTree();
       Node Tree= tree.Preorder(nodes);
       System.out.println(Tree.data);
       System.out.println(Tree.data);
    }
}

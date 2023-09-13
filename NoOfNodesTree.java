public class NoOfNodesTree {
    static class Node{
      int data;
      Node right;
      Node left;
      public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
      }
    } 
    public static int NumberOfNodes(Node root){
           if(root==null){
           return 0;
           } 
           int left=NumberOfNodes(root.left);
           int right=NumberOfNodes(root.right); 
           return left+right+1;

    }
    public static void main(String args[]){
       Node root=new Node(1);
      root.left=new Node(2);
      root.right=new Node(3);
      root.left.left=new Node(4);
      root.left.right=new Node(5);
      root.right.right=new Node(6); 

      System.out.println(NumberOfNodes(root)); 
    }
}

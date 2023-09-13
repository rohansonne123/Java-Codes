import java.util.*;
import java.util.Queue;
public class LevelTraversal { 
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
    public static void Level(Node root){
        Queue<Node> q=new LinkedList<>() ; 
        q.add(root);
        q.add(null); 
        while(!q.isEmpty()){
        Node currnode=q.remove();
        if(currnode==null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{ 
            System.out.print(currnode.data+" ");
            if(currnode.left!=null ){
            q.add(currnode.left);
            }
            if(currnode.right!=null ){
                q.add(currnode.right);
            }

        }
    }

    }
    public static void main(String args[]){
      Node root=new Node(1);
      root.left=new Node(2);
      root.right=new Node(3);
      root.left.left=new Node(4);
      root.left.right=new Node(5);
      root.right.right=new Node(6); 

      Level(root);
    }
}

import java.util.*;
public class kth_levelTree {
    static class node{
        int data;
        node right;
        node left;

        public node(int data){
             this.data=data;
             this.right=right;
             this.left=left;
        }
    }  
    //recursive approach
    public static void KthLevel(node root,int level,int k){ 
        if(root==null){
            return;
        }
          if(level==k){
            System.out.println(root.data);
            return;
          } 
          KthLevel(root.left,level+1,k);
          KthLevel(root.right,level+1,k);
    } 
    //itterative approach
    public static void KthLevelItte(node root,int level,int k){
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            node curr=q.remove();
            if(curr==null){ 
                
                 if(q.isEmpty()){
                    break;
                 }else{
                    q.add(null);
                    level++;
                 }
            }else{
                 
                if(curr.left!=null){
                    q.add(curr.left);
                } 
                if(curr.right!=null){
                    q.add(curr.right);
                } 
                
                if(level==k){
                    System.out.println(curr.data);
                }
            }
        }

    }

   public static void main(String args[]){
    node root=new node(1);
    root.left=new node(2);
    root.right=new node(3);
    root.right.right=new node(6);
    root.left.left=new node(4);
    root.left.right=new node(5); 
    KthLevel(root,1,3); 
   // KthLevelItte(root,1,3);
   } 
}

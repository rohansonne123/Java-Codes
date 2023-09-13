import java.util.*;
public class TopViewTree { 
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
    static class info{
        int hd;
        node Node;
        public  info(int hd,node Node){
            this.hd=hd;
            this.Node=Node;
        }
    }
    public static void topnode(node root){
        Queue<info> q=new LinkedList<>(); 
        HashMap<Integer,node> map=new HashMap<>();
        int min=0,max=0;
        q.add(new info(0,root));
        q.add(null); 

        while(!q.isEmpty()){
            info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            } else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.Node);
                 } 
     
                 if(curr.Node.left!=null){
                    q.add(new info(curr.hd-1,curr.Node.left)); 
                    min=Math.min(min,curr.hd-1);
                 } 
     
                 if(curr.Node.right!=null){
                     q.add(new info(curr.hd+1,curr.Node.right));
                     max=Math.max(max,curr.hd+1);
                 }
            }

            

        } 
        for(int i=min;i<=max;i++){
            System.out.println(map.get(i).data);
        }
    }
    public static void main(String args[]){
      node root=new node(1);
      root.left=new node(2);
      root.right=new node(3);
      root.right.right=new node(6);
      root.left.left=new node(4);
      root.left.right=new node(5);
     topnode(root);
    }
}

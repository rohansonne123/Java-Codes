import java.util.*;
public class DiameterTree {
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
    public static int height(Node root){ 
        if(root==null){
            return 0;
        } 
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    } 
    public static int Diameter(Node root){ 
        if(root==null){
            return 0;
        }
        int ld=Diameter(root.left);
        int lh=height(root.left);
        int rd=Diameter(root.right);
        int rh=height(root.right);

        int self=(lh+rh+1);
        return Math.max(self,Math.max(ld,rd));
    } 
    static class  Info{
        int diam;
        int hei; 
        public  Info(int diam,int hei){
            this.diam=diam;
            this.hei=hei;
        }
    } 
    public static Info Diameter1(Node root){
       if(root==null){
         return new Info(0,0);
       } 
       Info leftinfo=Diameter1(root.left);
       Info rightinfo=Diameter1(root.right);

       int diam=Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.hei+rightinfo.hei+1);
       int hei=Math.max(leftinfo.hei,rightinfo.hei)+1;
       return new Info(diam,hei);
    }
    public static void main(String args[]){
      Node root=new Node(1);
       root.left=new Node(2);
       root.right=new Node(3);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
       root.right.right=new Node(7); 
       height(root);
       System.out.println(Diameter(root)); 
       System.out.println(Diameter1(root).diam);
       System.out.println(Diameter1(root).hei);
    }
}

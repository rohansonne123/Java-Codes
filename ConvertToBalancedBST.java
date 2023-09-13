import java.util.*;
public class ConvertToBalancedBST {
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
    public static void Inorder(node root,ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        Inorder(root.left,inorder);
        inorder.add(root.data);
        Inorder(root.right,inorder);
    }
    public static node balancedBST(ArrayList<Integer> inorder,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        node root=new node(inorder.get(mid));
        root.left=balancedBST(inorder,si,mid-1);
        root.right=balancedBST(inorder,mid+1,ei);

        return root;
    }
    public static node BalancedBST(node root){
        //finding the inorder sequence
        ArrayList<Integer> inorder=new ArrayList<>();
        Inorder(root,inorder);

        //finding the balanced BST
        root=balancedBST(inorder,0,inorder.size()-1);
        return  root;
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
        node root=new node(6);
        root.left=new node(5);
        root.left.left=new node(4);
        root.left.left.left=new node(3);

        root.right=new node(7);
        root.right.right=new node(8);
        root.right.right.right=new node(9);
        preorder(root);
        System.out.println();
        root=BalancedBST(root);
        preorder(root);
    }
}

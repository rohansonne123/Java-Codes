public class MinimumDistanceBtwTwoNodes {
    static class node{
        int data;
        node right;
        node left;
        public node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    } 
    public static node LCR2(node root,int n1,int n2 ){
        if(root==null){
            return null;
        } 
        if(root.data==n1||root.data==n2){
            return root;
        } 
        node leftlcr=LCR2(root.left,n1,n2);
        node rightlcr=LCR2(root.right,n1,n2);
        if(leftlcr==null){
            return rightlcr;
        } 
        if(rightlcr==null){
            return leftlcr;
        } 

        return root;
    } 
    public static int mindist(node lcr,int n){
        if(lcr==null){
            return -1;
        } 
        if(lcr.data==n){
            return 0;
        } 
        int left=mindist(lcr.left,n);
        int right=mindist(lcr.right,n);
        if(left==-1&&right==-1){
            return -1;
        }else if(left==-1){
            return right+1;
        }else{
            return left+1;
        }
    }
    public static int MiniDist(node root,int n1,int n2){
        node lcr=LCR2(root,n1,n2);
        int leftdist=mindist(lcr,n1);
        int rightdist=mindist(lcr,n2);

        return leftdist+rightdist;
    }
    public static void main(String args[]){
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.right.right=new node(6);
        root.left.left=new node(4);
        root.left.right=new node(5);
        LCR2(root,4,6);
        System.out.println(MiniDist(root,4,6));
        
  
    }
}

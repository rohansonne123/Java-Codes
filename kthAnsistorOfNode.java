public class kthAnsistorOfNode {
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
    public static int KthAnsistor(node root,int k,int Node){
        if(root==null){
           return -1;
        } 
        if(root.data==Node){
            return 0;
        }
        int left=KthAnsistor(root.left,k,Node);
        int right=KthAnsistor(root.right,k,Node);

        int max=Math.max(left,right);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String args[]){
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.right.right=new node(6);
        root.left.left=new node(4);
        root.left.right=new node(5);
        KthAnsistor(root,2,5);
    }
}

public class SubtreeOfTree {
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
    public static boolean isidentical(node root,node subroot){
        if(root==null&&subroot==null){
            return true;
        }else if(root==null||subroot==null||root.data!=subroot.data){
            return false;
        }

        if(!isidentical(root.left,subroot.left)){
            return false;
        }
        if(!isidentical(root.right,subroot.right)){
            return false;
        }

        return true;
    }
    public static boolean issubtree(node root,node subroot){ 
        if(root==null){
            return false;
        }
       if(root.data==subroot.data){
           if(isidentical(root,subroot)){
             return true;
           }
       } 
       boolean leftans=issubtree(root.left,subroot);
       boolean rightans=issubtree(root.right,subroot);

       return leftans||rightans;
    }
    public static void main(String args[]){ 
        //tree
        //        1
        //     /     \
        //    2       3
        //  /   \       \
        // 4     5       6
       node root=new node(1);
       root.left=new node(2);
       root.right=new node(3);
       root.left.left=new node(4);
       //root.left.right=new node(5);
       root.right.right=new node(6);

       //sub treee
       node subroot=new node(2);
       subroot.left=new node(4);
       subroot.right=new node(5); 

       System.out.println(issubtree(root,subroot));

    }
}

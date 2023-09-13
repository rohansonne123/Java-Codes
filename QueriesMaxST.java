public class QueriesMaxST {
     static int temp[];
    public static void init(int n){
        temp=new int[4*n];
    }
    public static int CreateST(int i,int si,int sj,int arr[]){
        if(si==sj){
            temp[i]=arr[si];
            return arr[si];
        }
        int mid=(si+sj)/2;
        int left=CreateST(2*i+1, si, mid, arr);
        int right=CreateST(2*i+2, mid+1, sj, arr);

        return temp[i]=Math.max(left, right);
    }
    public static int getMax(int arr[],int q1,int q2){
        return getMaxUtil(0,0,arr.length-1,q1,q2);
    }
    public static int getMaxUtil(int i,int si,int sj,int qi,int qj){
        if(sj<qi || si>qj){
            return Integer.MIN_VALUE;
        }else if(si>=qi && sj<=qj){
            return temp[i];
        }else{
            int mid=(si+sj)/2;
            int left=getMaxUtil(2*i+1, si, mid, qi, qj);
            int right=getMaxUtil(2*i+2, mid+1, sj, qi, qj);

            return Math.max(left, right);
        }
    }
    public static void main(String args[]){
        int arr[]={6,8,-1,2,17,1,3,2,4};
        init(arr.length);
        CreateST(0, 0, arr.length-1, arr);
        // for(int i=0;i<temp.length;i++){
        //     System.out.println(temp[i]+" ");
        // }
        int max=getMax(arr, 2, 5);
        System.out.println(max);
    } 
}

public class CreateMaxST {
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
    public static void main(String args[]){
        int arr[]={6,8,-1,2,17,1,3,2,4};
        init(arr.length);
        CreateST(0, 0, arr.length-1, arr);
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]+" ");
        }
    }
}

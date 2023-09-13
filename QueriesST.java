public class QueriesST {
    static int temp[];
    public static void init(int n){
         temp=new int[4*n];
    }
    public static int CreateST(int arr[],int si,int i,int j){
      if(i==j){
        temp[si]=arr[i];
        return arr[i];
      }
      int mid=(i+j)/2;

      int left=CreateST(arr, 2*si+1, i, mid);
      int right=CreateST(arr, 2*si+2, mid+1, j);

      temp[si]=left+right; 


      return temp[si];
    }
    public static int QuireUtil(int i,int si,int sj,int qi,int qj){
        if(qj<=si || sj<=qi){ //not overlapping
            return 0;
        }else if(si>=qi && sj<=qj ){ //completly overlapped
            return temp[i];
        }else{
            int mid=(si+sj)/2;
            int left=QuireUtil(2*i+1, si, mid, qi, qj);
            int right=QuireUtil(2*i+2, mid+1, sj, qi, qj);

            return left+right;
        }
    }
    public static int Quire(int arr[],int qi,int qj){
        return QuireUtil(0,0,arr.length-1,qi,qj);
    }
    public static void main(String args[]){
      int arr[]={1,2,3,4,5,6,7,8};
      init(arr.length);
      CreateST(arr, 0, 0, arr.length-1);

      System.out.println(Quire(arr, 2, 5));
    }
}

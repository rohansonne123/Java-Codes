public class CreationOfST {
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
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        init(arr.length);
        CreateST(arr, 0, 0, arr.length-1);
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}

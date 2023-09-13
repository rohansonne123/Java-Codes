public class HeapSort {
    public static void hepify(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*1+2;
        int minval=i;

        if(left<size&&arr[minval]<arr[left]){
            minval=left;
        }
        if(right<size&&arr[minval]<arr[right]){
            minval=right;
        } 

        if(minval!=i){
            int temp=arr[i];
             arr[i]=arr[minval];
             arr[minval]=temp;

             hepify(arr,minval,size);
        }
    }
    public static void heapsort(int arr[]){
        //finding the max heap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
           hepify(arr,i,n);
        }
        //swapping the first with last
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            hepify(arr,0,i);
        }
    }
   public static void main(String args[]){
    int arr[]={1,2,4,5,3};
    heapsort(arr);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
   } 
}

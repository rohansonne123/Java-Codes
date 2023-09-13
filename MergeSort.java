public class MergeSort { 
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
           
            return;
        } 
        int mid=si+(ei-si)/2; 
        mergesort(arr,si,mid); 
        
        mergesort(arr,mid+1,ei); 
        
        System.out.println();
        merge(arr,mid,si,ei);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void merge(int arr[],int mid,int si,int ei){
       int temp[]=new int[ei-si+1];
       int k=0;
       int i=si;
       int j=mid+1;
       while(i<=mid&&j<=ei){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;k++;
        }else{
            
            temp[k]=arr[j];
            j++;k++;
        }
       } 
       while(i<=mid){
        temp[k++]=arr[i++];
        
       } 
       while(j<=ei){
        temp[k++]=arr[j++];
        
       } 
       for(j=si,k=0;k<temp.length;j++,k++){
            arr[j]=temp[k];
       }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,7,2,1}; 
        mergesort(arr,0,arr.length-1); 
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

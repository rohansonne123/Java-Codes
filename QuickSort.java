public class QuickSort { 
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){ 
           
            return;
        } 
        
        int pivotidx=pivote(arr,si,ei);
        
        quicksort(arr,si,pivotidx-1); 
    
        quicksort(arr,pivotidx+1,ei);
        
    } 
    public static int pivote(int arr[],int si,int ei){
       
        int j=si-1;
        int pivote=arr[ei];
       for(int i=si;i<ei;i++) {
            
             if(arr[i]<=pivote){
                j++;
                int temp=arr[j]; 
    			arr[j]=arr[i]; 
    			arr[i]=temp;
             } 
            
        } 
        
            j++;
            int temp=arr[j]; 
            arr[j]=arr[ei]; 
            arr[ei]=temp;  
            
            return j;
         
         
    }
    public static void main(String args[]){
        int arr[]={1,2,3,6,5,4}; 
        quicksort(arr,0,arr.length-1); 
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

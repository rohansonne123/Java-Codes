public class InsertionSort { 
    public static void insertionsort(String arr[]){
        for(int i=1;i<arr.length;i++){ 
            String count=arr[i];
            int j=i-1;
            while(j>=0&&count.compareTo(arr[j])<0){
                arr[j+1]=arr[j];
                j--;
            } 
            arr[j+1]=count; 
            for(int k=0;k<arr.length;k++){
                System.out.println(arr[k]);
               }
               System.out.println();
            
        }
    }
    public static void main(String args[]){
      String arr[]={"rohan","swaroop","jayesh"}; 
       insertionsort(arr);
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
    }
}

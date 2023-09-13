public class selectionsort { 
    public static void SelectionSort(String arr[]){ 
        
        for(int i=0;i<arr.length;i++){ 
            int idx=i;
            int j=i+1; 
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]);
            } 
            System.out.println();
            while(j<arr.length){ 
                String str=arr[idx];
                if((str.compareTo(arr[j]))>0){
                  idx=j; 
                } 
                j++;
            } 
            String temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp; 
            
        }
    }
    public static void main(String args[]){
      String arr[]={"efg","abc","hij"};
      SelectionSort(arr); 
      for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i]);
      }
    }
}

public class leetcode {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int arr[]=new int[nums1.length+nums2.length];
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<=nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }else if(nums1[i]>=nums2[j]){
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            arr[k]=nums1[i];
            i++;
            k++;
            
        }
        while(i<nums2.length){
            arr[k]=nums2[j];
            j++;
            k++;
            
        }
        for(int l=0;l<arr.length;l++){
             System.out.println(arr[l]);
        }
        int mid=(arr.length-1)/2;
        int min=arr.length/2;
        if(arr.length%2==0){
           // mid=(nums1.length+nums2.length-1)/2;
            return  (arr[mid]+arr[min])/2;

        }else{
            return arr[mid];
        }

        

    }
    public static void main(String args[]){
        int nums1[]={1,2};
        int nums2[]={3,4};
        findMedianSortedArrays( nums1,  nums2) ;
        
    }
}


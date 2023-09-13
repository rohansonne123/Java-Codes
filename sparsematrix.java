import java.util.*;
public class sparsematrix {
    public static void main(String args[]){ 
        System.out.println("enter the no of rows of array");
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        System.out.println("enter the no of columns of array");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            } 
            System.out.println();

        }  
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]!=0){
                    count++;
                }
            } 
            System.out.println();

        } 
        int arr1[][]=new int[count][3]; 
        int r=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){ 
                if(arr[i][j]!=0){ 
                    
                       for(int k=0;k<arr1[0].length;k++){ 
                        if(k==0){
                            arr1[r][k]=i;
                        }else if(k==1){
                            arr1[r][k]=j;
                        }else{
                            arr1[r][k]=arr[i][j];
                        }
                     
                  //  System.out.println(); 
                }
                r++; 
                }
            
            } 
           // System.out.println();

        } 
           
        System.out.println("row  col  val");
        for(int l=0;l<count;l++){
            for(int k=0;k<arr1[0].length;k++){ 
                System.out.print(arr1[l][k] +"   ");
            } 
            System.out.println(); 
        }
    }
}

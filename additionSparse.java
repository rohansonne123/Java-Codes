import java.util.*;
public class additionSparse {
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
        System.out.println("enter the no of rows of array");
         
        int A=sc.nextInt();
        System.out.println("enter the no of columns of array");
        int B=sc.nextInt();
        int arr2[][]=new int[A][B];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                arr2[i][j]=sc.nextInt();
            } 
            System.out.println();

        }  
         int ring=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                if(arr2[i][j]!=0){
                   ring++;
                }
            } 
            System.out.println();

        } 
        int arr3[][]=new int[ring][3]; 
         int x=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){ 
                if(arr2[i][j]!=0){ 
                    
                       for(int k=0;k<arr3[0].length;k++){ 
                        if(k==0){
                            arr3[x][k]=i;
                        }else if(k==1){
                            arr3[x][k]=j;
                        }else{
                            arr3[x][k]=arr[i][j];
                        }
                     
                  //  System.out.println(); 
                }
                x++; 
                }
            
            } 
           // System.out.println();

        }  
        System.out.println("row  col  val");
        if(n==A&&m==B&&ring==count){
            for(int i=0;i<count;i++){
                for(int j=0;j<3;j++){
                    System.out.print(arr1[i][j]+arr3[i][j] + " ");
                } 
                System.out.println();
            }
        }else{
            System.out.println("lengths are not equal");
        } 
        System.out.println("the transpose of given sparse matrix is");
        if(n==A&&m==B&&ring==count){
            for(int i=0;i<3;i++){
                for(int j=0;j<count;j++){
                    System.out.print(arr1[i][j]+arr3[i][j] + " ");
                } 
                System.out.println();
            }
        }else{
            System.out.println("lengths are not equal");
        }
    }
}

public class BitManupulation1 {
    public static int ClearBitsInRange(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int BitMask=(a|b);
        return  n&BitMask;
    }
    public static boolean PowerOfTwo(int n){
        return (n&(n-1))==0;
    }
    public static int TotalBits(int n){
        int count=0;
        while(n>0){
            if(((n)&1)!=0){
                count++;
            }
            n=n>>1;
        }

        return count;
    }
    public static void main(String args[]){
      System.out.println("number after clearing the bits in the Range :"+ ClearBitsInRange(31, 2, 5));
      System.out.println(PowerOfTwo(5));
      System.out.println("The total number of set bits in given number is:"+ TotalBits(5));
    }
}

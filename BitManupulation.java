public class BitManupulation {
    public static void OddOREven(int n){
        int BitMask=1;
        if((n&BitMask)==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
    public static int GetIthBit(int n,int i){
       int BitMask=1<<i;
       if((n&BitMask)==0){
        return 0;
       }else{
        return 1;
       }
    }
    public static int SetIthBit(int n,int i){
        int BitMask=1<<i;
        return n|BitMask;
    }
    public static int ClearIthBit(int n,int i){
       int BitMask=1<<i;
       return n&(~BitMask);
    }
    public static int UpdateIthBit(int n,int i,int newbit){
        n=ClearIthBit(n, i);
        int BitMask=newbit<<i;
        return n|BitMask;
    }
    public static int ClearIBits(int n,int i){
        int BitMask=(~0)<<i;
        return n&BitMask;
    }
    public static void main(String args[]){
        System.out.println("Bit-Wise And is"+ (5&6));
        System.out.println("Bit-Wise OR is"+(4|5));
        System.out.println("Bit-Wise XOR is"+(4^5));
        System.out.println("Bit-Wise One's complement is"+(~9));
        System.out.println("left-shift is :"+ (5<<2));
        System.out.println("Right shift is:"+(5>>2));
        OddOREven(3);
        System.out.println("The ith bit is:"+ GetIthBit(5,2));
        System.out.println("The number after set ith bit :"+ SetIthBit(5, 2));
        System.out.println("After Clearing the ith bit :"+ ClearIthBit(5, 2));
        System.out.println("The number after updating ith bit :"+ UpdateIthBit(5,3,1));
        System.out.println("After Clearing Last i bits Number is :"+ ClearIBits(15, 2));
        
    }
}

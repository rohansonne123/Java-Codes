public class BitManipulationPower {
    public static int power(int x){
        int n=x;
        int ans=1;
        while(x>0){
           if((x&1)!=0){
            ans=ans*n;
           }
           n=n*n;
           x=x>>1;
        }
        return ans;
    }
    public static void main(String args[]){
      System.out.println(power(2));
      System.out.println((~4)&1);
      System.out.println(~(-4));
    }
}

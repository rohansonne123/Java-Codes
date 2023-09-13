public class firendsPairing {
    public static int friendspair(int n){
        if(n==1||n==2){
            return n;
        }
        int f1=friendspair(n-1);
        int f2=(n-1)*friendspair(n-2);

        return f1+f2;
    }
    public static void main(String args[]){
        int n=3;
        System.out.println(friendspair(n));
    }
    
}

public class OOPS {
    public static void main(String args[]){
        pen p1=new pen();
        p1.color="biue";
        p1.setcolor("white");
        System.out.println(p1.color);
        p1.setdata(4);
        System.out.println(p1.getdata());
        bankaccount b1=new bankaccount("rohan");
        System.out.println(b1.username);
    }
}

class pen{
    String color;
    private int tip;
    
    public void setdata(int newtip){
        this.tip=newtip;
    }
    public int getdata(){
       return  this.tip=tip;
    }
    public void setcolor(String newcolor){
        color=newcolor;
    }
}
class bankaccount{
    int data;
    String username;
    bankaccount(String newusername){
      this.username=newusername;
    }
}

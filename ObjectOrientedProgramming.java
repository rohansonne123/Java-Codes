public class ObjectOrientedProgramming {
    public static void main(String args[]){
      pen p1=new pen();
      System.out.println();
      p1.setcolor("blue");
      //p1.getcolor();
      System.out.println(p1.getcolor());
    }
}
class pen{
    int number;
     String color="Red";
    public void setcolor(String newcolor){
        this.color=newcolor;
    }
    public String  getcolor(){
        return this.color=color;
    }
}

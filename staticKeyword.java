public class staticKeyword {
   public static void main(String args[]){
     info i1=new info();
     i1.getdata("rohan");
     System.out.println(i1.name);
     i1.schoolname="abc";
     info i2=new info();
     System.out.println(i2.schoolname);
   } 
}

class info{
    int n;
    String name;
    static String schoolname;

    void setdata(){
        System.out.println("my name is rohan");
    }
    String  getdata(String name){
        return this.name=name;
    }
}

public class abstractClass {
    public static void main(String args[]){
     fish f=new fish();
     //f.fish();
     f.eat();
    }
}

interface  animal{
    
    void eat();
     void walk();
}
interface  human{
     void sleep();
}
class fish implements animal,human{
    String name;
    
    
    public void eat(){
        System.out.println("horse eat grass");
    }
    public void walk(){

    }
    public  void sleep(){

    }
}

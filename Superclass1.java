import java.util.*;
public class Superclass1 {
    public static void main(String args[]){
      fish f=new fish();
      System.out.println(f.color);
      
    }
}

class animal{
    String color;
    animal(){
        System.out.println("animal eat");
    }
}

class fish extends animal{
    fish(){
        super();
        System.out.println("fish is eat");
    }
}

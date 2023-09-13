import java.util.*;
public class superclass {
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
        super.color="brown";
        System.out.println("fish is eat");
    }
}

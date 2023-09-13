public class inheritance {
    public static void main(String args[]){
     fish f=new fish();
     f.eat();
    }
}

class animal{
    int legs;
    public void eat(){
        System.out.println("animal is eaating");
    }
}

class fish extends animal{
    void fly(){
        System.out.println("fish is flying");
    }
}

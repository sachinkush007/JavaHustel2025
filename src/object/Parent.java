package object;

import java.io.IOException;

public class Parent {
     void start() throws IOException {
        System.out.println("parnet");

    }

}
class Child extends Parent{
     void start(){
        System.out.println("child");
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.start();
    }

}

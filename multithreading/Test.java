package multithreading;


class Parent {
public void methodone (){
    System.out.println("Parent") ;
}
}

class Child extends Parent {
public void methodiwo(){
    System.out.println("Child") ;
}
}
public class Test {
    public static void main(String[] args) {
        Parent p= new Parent();
        p.m1();
        p.m2();
    }
}

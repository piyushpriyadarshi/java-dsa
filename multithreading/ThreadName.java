package multithreading;


class MyThread extends Thread{

    @Override
public void run(){
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getPriority()+" \t Child Thread Priority");
}

}

public class ThreadName {
    
    public static void main(String[] args) {
        System.out.println("Hello");
        MyThread t1= new MyThread();
        t1.start();
        
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Piyush-main-thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority()+" \t Main Thread Priority");


    }
}

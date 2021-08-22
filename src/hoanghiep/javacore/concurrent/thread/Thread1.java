package hoanghiep.javacore.concurrent.thread;

public class Thread1 extends Thread{
    public void run () {
        System.out.println("Hello from thread 1");
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
    }
}

class Thread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("hello from thread 2");
    }

    public static void main(String[] args) {
        new Thread(new Thread2()).start();
    }
}

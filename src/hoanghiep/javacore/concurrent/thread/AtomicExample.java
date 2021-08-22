package hoanghiep.javacore.concurrent.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AtomicExample extends Thread {

    int count = 0;

    @Override
    public void run() {
        int max = 100000000;

        for (int j = 0; j < max; j++) {
            count++;
        }
    }
}

class UnSafeCounter {

    public static void main(String[] args) throws InterruptedException{
//        AtomicExample c = new AtomicExample();
//
//        Thread first = new Thread(c, "first");
//        Thread second = new Thread(c, "second");
//
//        first.start();
//        second.start();
//
//        first.join();
//        second.join();
//
//        System.out.println(c.count);

        AtomicInteger atomicInt = new AtomicInteger(0);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, 1000)
                .forEach(i -> executor.execute(atomicInt::incrementAndGet));

        executor.shutdown();

        System.out.println(atomicInt.get());    // => 1000
    }
}

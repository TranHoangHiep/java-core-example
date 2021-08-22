package hoanghiep.javacore.concurrent.thread;

public class SleepMessage {

    public static void main(String[] args) throws InterruptedException {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (int j = 0; j < importantInfo.length; j++) {
            // pause for 1 seconds
            Thread.sleep(1000);
            System.out.println(importantInfo[j]);
        }
    }
}

package job;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.println(new Date());

            Thread.sleep(10000);
        }
    }
}

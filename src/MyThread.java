/**
 * Created by Wenjian on 2016/5/15, 0015.
 */
public class MyThread implements Runnable {
    private int count = 1;
    private int number;

    public MyThread(int num) {
        this.number = num;
        System.out.println("Create Thread- " + number);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Thread - " + number + " run " + count + " times");
            if (++count == 3) return;
        }
    }
}

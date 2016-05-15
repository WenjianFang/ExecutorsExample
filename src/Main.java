import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Wenjian on 2016/5/15, 0015.
 */
public class Main {
    public static void main (String[] args) {
        //ExecutorService exec = Executors.newCachedThreadPool();
        //ExecutorService exec = Executors.newFixedThreadPool(2);
        //ExecutorService exec = Executors.newSingleThreadExecutor();
        //for (int i = 0; i < 5; i++) {
        //    exec.execute(new MyThread(i));
        //}
        //exec.shutdown();
        ExecFromFactory exe = new ExecFromFactory();
        exe.run();
    }
}

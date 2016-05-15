import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Wenjian on 2016/5/15, 0015.
 */
public class ExecFromFactory {
    public void run() {
        ExecutorService defaultExec = Executors.newCachedThreadPool();
        ExecutorService daemonExec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        ExecutorService maxPriorityExec = Executors.newCachedThreadPool(new MaxPriorityThreadFactory());
        ExecutorService minPriorityExec = Executors.newCachedThreadPool(new MinPriorityThreadFactory());

        for (int i = 0; i < 10; i++) {
            daemonExec.execute(new MyThread(i));
            System.out.println("daemonExec create complete ?");
        }
        for (int i = 10; i < 20; i++) {
            if (i == 10) {
                maxPriorityExec.execute(new MyThread(i));
                System.out.println("maxPriorityExec create complete?");
            }
            else if (i == 11) {
                minPriorityExec.execute(new MyThread(i));
                System.out.println("minPriorityExec create complete?");
            }
            else {
                defaultExec.execute(new MyThread(i));
                System.out.println("defaultExec create complete?");
            }
        }
    }
}

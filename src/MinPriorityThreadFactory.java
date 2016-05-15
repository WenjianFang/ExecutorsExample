import java.util.concurrent.ThreadFactory;

/**
 * Created by Wenjian on 2016/5/15, 0015.
 */
public class MinPriorityThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(Thread.MIN_PRIORITY);
        return t;
    }
}

import java.util.concurrent.ThreadFactory;

/**
 * Created by Wenjian on 2016/5/15, 0015.
 */
public class DaemonThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}

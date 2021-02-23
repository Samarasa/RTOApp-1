package c.b.b.b.d.e;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public interface b {
    ExecutorService a(ThreadFactory threadFactory, int i);

    ScheduledExecutorService a(int i, ThreadFactory threadFactory, int i2);
}

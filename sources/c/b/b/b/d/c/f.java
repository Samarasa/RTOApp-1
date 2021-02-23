package c.b.b.b.d.c;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class f implements e {
    private f() {
    }

    public final ScheduledExecutorService b(int i, int i2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}

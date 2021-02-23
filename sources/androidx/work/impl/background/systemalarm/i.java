package androidx.work.impl.background.systemalarm;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class i implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private int f1830a = 0;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j f1831b;

    i(j jVar) {
        this.f1831b = jVar;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("WorkManager-WorkTimer-thread-" + this.f1830a);
        this.f1830a = this.f1830a + 1;
        return newThread;
    }
}

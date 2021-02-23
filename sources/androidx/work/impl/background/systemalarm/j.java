package androidx.work.impl.background.systemalarm;

import androidx.work.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1832a = h.a("WorkTimer");

    /* renamed from: b  reason: collision with root package name */
    private final ThreadFactory f1833b = new i(this);

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f1834c = Executors.newSingleThreadScheduledExecutor(this.f1833b);

    /* renamed from: d  reason: collision with root package name */
    final Map<String, b> f1835d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    final Map<String, a> f1836e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    final Object f1837f = new Object();

    interface a {
        void a(String str);
    }

    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final j f1838a;

        /* renamed from: b  reason: collision with root package name */
        private final String f1839b;

        b(j jVar, String str) {
            this.f1838a = jVar;
            this.f1839b = str;
        }

        public void run() {
            synchronized (this.f1838a.f1837f) {
                if (this.f1838a.f1835d.remove(this.f1839b) != null) {
                    a remove = this.f1838a.f1836e.remove(this.f1839b);
                    if (remove != null) {
                        remove.a(this.f1839b);
                    }
                } else {
                    h.a().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f1839b}), new Throwable[0]);
                }
            }
        }
    }

    j() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f1834c.isShutdown()) {
            this.f1834c.shutdownNow();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        synchronized (this.f1837f) {
            if (this.f1835d.remove(str) != null) {
                h.a().a(f1832a, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f1836e.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, long j, a aVar) {
        synchronized (this.f1837f) {
            h.a().a(f1832a, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            a(str);
            b bVar = new b(this, str);
            this.f1835d.put(str, bVar);
            this.f1836e.put(str, aVar);
            this.f1834c.schedule(bVar, j, TimeUnit.MILLISECONDS);
        }
    }
}

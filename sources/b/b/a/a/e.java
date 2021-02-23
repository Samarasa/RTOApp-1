package b.b.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class e extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2144a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f2145b = Executors.newFixedThreadPool(4, new d(this));

    /* renamed from: c  reason: collision with root package name */
    private volatile Handler f2146c;

    public void a(Runnable runnable) {
        this.f2145b.execute(runnable);
    }

    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void b(Runnable runnable) {
        if (this.f2146c == null) {
            synchronized (this.f2144a) {
                if (this.f2146c == null) {
                    this.f2146c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f2146c.post(runnable);
    }
}

package androidx.work.impl.utils.b;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.h;
import java.util.concurrent.Executor;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1998a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f1999b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final Executor f2000c = new b(this);

    public c(Executor executor) {
        this.f1998a = new h(executor);
    }

    public Executor a() {
        return this.f2000c;
    }

    public void a(Runnable runnable) {
        this.f1998a.execute(runnable);
    }

    public Executor b() {
        return this.f1998a;
    }

    public void b(Runnable runnable) {
        this.f1999b.post(runnable);
    }
}

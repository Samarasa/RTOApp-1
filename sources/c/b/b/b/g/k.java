package c.b.b.b.g;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f4711a = new a();

    /* renamed from: b  reason: collision with root package name */
    static final Executor f4712b = new C();

    private static final class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f4713a = new c.b.b.b.d.g.a(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f4713a.post(runnable);
        }
    }
}

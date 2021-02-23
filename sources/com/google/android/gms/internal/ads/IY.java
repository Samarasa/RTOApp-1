package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.YX;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

class IY<V> implements LY<V> {

    /* renamed from: a  reason: collision with root package name */
    static final LY<?> f7296a = new IY((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f7297b = Logger.getLogger(IY.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private final V f7298c;

    static final class a<V> extends YX.j<V> {
        a(Throwable th) {
            a(th);
        }
    }

    IY(V v) {
        this.f7298c = v;
    }

    public void a(Runnable runnable, Executor executor) {
        C1434cX.a(runnable, (Object) "Runnable was null.");
        C1434cX.a(executor, (Object) "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f7297b;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), e2);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public V get() {
        return this.f7298c;
    }

    public V get(long j, TimeUnit timeUnit) {
        C1434cX.a(timeUnit);
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f7298c);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }
}

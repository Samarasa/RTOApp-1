package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class h implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<a> f2011a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f2012b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f2013c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private volatile Runnable f2014d;

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final h f2015a;

        /* renamed from: b  reason: collision with root package name */
        final Runnable f2016b;

        a(h hVar, Runnable runnable) {
            this.f2015a = hVar;
            this.f2016b = runnable;
        }

        public void run() {
            try {
                this.f2016b.run();
            } finally {
                this.f2015a.a();
            }
        }
    }

    public h(Executor executor) {
        this.f2012b = executor;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        synchronized (this.f2013c) {
            Runnable poll = this.f2011a.poll();
            this.f2014d = poll;
            if (poll != null) {
                this.f2012b.execute(this.f2014d);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f2013c) {
            this.f2011a.add(new a(this, runnable));
            if (this.f2014d == null) {
                a();
            }
        }
    }
}

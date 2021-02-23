package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

class y implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1622a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<Runnable> f1623b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private Runnable f1624c;

    y(Executor executor) {
        this.f1622a = executor;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a() {
        Runnable poll = this.f1623b.poll();
        this.f1624c = poll;
        if (poll != null) {
            this.f1622a.execute(this.f1624c);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f1623b.offer(new x(this, runnable));
        if (this.f1624c == null) {
            a();
        }
    }
}
